package com.dev.market.product.model.dao;

import com.dev.market.product.model.dto.*;
import com.dev.market.product.model.vo.ProductDetailInfoVO;
import com.dev.market.product.model.vo.ProductInfoVO;
import com.dev.market.product.model.vo.ProductKeywordInfoVO;
import com.dev.market.product.model.vo.ProductViewInfoVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductDAO {
    List<ProductInfoVO> selectProductInfoList();

    ProductDetailInfoVO selectProductInfo(ProductSelectRequestDTO productSelectRequestDTO);

    Integer insertProductViewCnt(ProductViewInsertRequestDTO productViewInsertRequestDTO);

    Integer insertProductInfo(ProductInsertRequestDTO productInsertRequestDTO);

    Integer insertProductDetailInfo(ProductInsertRequestDTO productInsertRequestDTO);

    Integer insertProductCategorySelectInfo(ProductInsertRequestDTO productInsertRequestDTO);

    Integer updateProductInfo(ProductUpdateRequestDTO productUpdateRequestDTO);

    Integer updateProductCategoryInfo(ProductUpdateRequestDTO productUpdateRequestDTO);

    Integer updateProductState(ProductUpdateStateRequestDTO productUpdateStateRequestDTO);

    Integer deleteProductInfo(ProductDeleteRequestDTO productDeleteRequestDTO);

    Integer deleteProductDetailInfo(ProductDeleteRequestDTO productDeleteRequestDTO);

    Integer deleteProductCategoryInfo(ProductDeleteRequestDTO productDeleteRequestDTO);

    List<ProductKeywordInfoVO> selectProductKeywordInfoList();

    ProductKeywordInfoVO selectProductKeywordInfo(ProductKeywordSelectRequestDTO productKeywordSelectRequestDTO);

    Integer insertProductKeywordInfo(ProductKeywordInsertRequestDTO productKeywordInsertRequestDTO);

    Integer deleteProductKeywordInfo(ProductKeywordDeleteRequestDTO productKeywordDeleteRequestDTO);

    List<ProductViewInfoVO> selectProductViewInfoList();
}
