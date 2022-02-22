package com.dev.market.product.service;

import com.dev.market.product.model.dto.*;
import com.dev.market.product.model.vo.ProductDetailInfoVO;
import com.dev.market.product.model.vo.ProductInfoVO;
import com.dev.market.product.model.vo.ProductKeywordInfoVO;
import com.dev.market.product.model.vo.ProductViewInfoVO;

import java.util.List;

public interface ProductService {
    List<ProductInfoVO> selectProductInfoList();

    ProductDetailInfoVO selectProductInfo(ProductSelectRequestDTO productSelectRequestDTO);

    Boolean insertProductInfo(ProductInsertRequestDTO productInsertRequestDTO);

    Boolean updateProductInfo(ProductUpdateRequestDTO productUpdateRequestDTO);

    Boolean updateProductState(ProductUpdateStateRequestDTO productUpdateStateRequestDTO);

    Boolean deleteProductInfo(ProductDeleteRequestDTO productDeleteRequestDTO);

    List<ProductKeywordInfoVO> selectProductKeywordInfoList();

    ProductKeywordInfoVO selectProductKeywordInfo(ProductKeywordSelectRequestDTO productKeywordSelectRequestDTO);

    Boolean deleteProductKeywordInfo(ProductKeywordDeleteRequestDTO productKeywordDeleteRequestDTO);

    List<ProductViewInfoVO> selectProductViewInfoList();
}
