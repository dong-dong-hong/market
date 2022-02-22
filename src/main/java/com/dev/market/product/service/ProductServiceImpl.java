package com.dev.market.product.service;

import com.dev.market.product.model.dao.ProductDAO;
import com.dev.market.product.model.dto.*;
import com.dev.market.product.model.vo.ProductDetailInfoVO;
import com.dev.market.product.model.vo.ProductInfoVO;
import com.dev.market.product.model.vo.ProductKeywordInfoVO;
import com.dev.market.product.model.vo.ProductViewInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<ProductInfoVO> selectProductInfoList() {
        return productDAO.selectProductInfoList();
    }

    @Override
    public ProductDetailInfoVO selectProductInfo(ProductSelectRequestDTO productSelectRequestDTO) {

        ProductViewInsertRequestDTO productViewInsertRequestDTO = new ProductViewInsertRequestDTO();
        productViewInsertRequestDTO.setPdNo(productSelectRequestDTO.getPdNo());

        productDAO.insertProductViewCnt(productViewInsertRequestDTO);

        return productDAO.selectProductInfo(productSelectRequestDTO);
    }

    @Override
    public Boolean insertProductInfo(ProductInsertRequestDTO productInsertRequestDTO) {

        if (productDAO.insertProductInfo(productInsertRequestDTO) != 1) {
            return false;
        }

        if (productDAO.insertProductDetailInfo(productInsertRequestDTO) != 1) {
            return false;
        }

        if (productDAO.insertProductCategorySelectInfo(productInsertRequestDTO) != 1) {
            return false;
        }

        return true;
    }

    @Override
    public Boolean updateProductInfo(ProductUpdateRequestDTO productUpdateRequestDTO) {

        if (productDAO.updateProductInfo(productUpdateRequestDTO) != 1) {
            return false;
        }

        if (productDAO.updateProductCategoryInfo(productUpdateRequestDTO) != 1) {
            return false;
        }

        return true;
    }

    @Override
    public Boolean updateProductState(ProductUpdateStateRequestDTO productUpdateStateRequestDTO) {

        return productDAO.updateProductState(productUpdateStateRequestDTO) == 1;
    }

    @Override
    public Boolean deleteProductInfo(ProductDeleteRequestDTO productDeleteRequestDTO) {

        if (productDAO.deleteProductInfo(productDeleteRequestDTO) != 1) {
            return false;
        }

        if (productDAO.deleteProductDetailInfo(productDeleteRequestDTO) != 1) {
            return false;
        }

        if (productDAO.deleteProductCategoryInfo(productDeleteRequestDTO) != 1) {
            return false;
        }

        return true;
    }


    @Override
    public List<ProductKeywordInfoVO> selectProductKeywordInfoList() {
        return productDAO.selectProductKeywordInfoList();
    }

    @Override
    public ProductKeywordInfoVO selectProductKeywordInfo(ProductKeywordSelectRequestDTO productKeywordSelectRequestDTO) {
        // 단순 검색으로 유입된 키워드는 상품번호를 0번으로 처리, 그 외에는 상품번호를 같이 넘겨주는 것으로 논의되었습니다
        ProductKeywordInsertRequestDTO productKeywordInsertRequestDTO = new ProductKeywordInsertRequestDTO();
        productKeywordInsertRequestDTO.setPdNo(0L);
        productKeywordInsertRequestDTO.setPdKeyword(productKeywordSelectRequestDTO.getPdKeyword());

        productDAO.insertProductKeywordInfo(productKeywordInsertRequestDTO);

        return productDAO.selectProductKeywordInfo(productKeywordSelectRequestDTO);
    }

    @Override
    public Boolean deleteProductKeywordInfo(ProductKeywordDeleteRequestDTO productKeywordDeleteRequestDTO) {
        return productDAO.deleteProductKeywordInfo(productKeywordDeleteRequestDTO) == 1;
    }


    @Override
    public List<ProductViewInfoVO> selectProductViewInfoList() {
        return productDAO.selectProductViewInfoList();
    }
}
