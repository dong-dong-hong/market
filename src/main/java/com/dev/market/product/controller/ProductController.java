package com.dev.market.product.controller;

import com.dev.market.product.model.dto.*;
import com.dev.market.product.model.vo.ProductDetailInfoVO;
import com.dev.market.product.model.vo.ProductInfoVO;
import com.dev.market.product.model.vo.ProductKeywordInfoVO;
import com.dev.market.product.model.vo.ProductViewInfoVO;
import com.dev.market.product.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = {"Product API"})
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ApiOperation(value = "상품 리스트 조회", notes = "상품에 대한 정보 리스트를 조회하는 API입니다.")
    @GetMapping("/info/list")
    public List<ProductInfoVO> selectProductInfoList() {
        return productService.selectProductInfoList();
    }

    @ApiOperation(value = "상품 상세 조회", notes = "상품에 대한 정보를 조회하는 API입니다.")
    @GetMapping("/info")
    public ProductDetailInfoVO selectProductInfo(
            @ApiParam(name = "pdNo", value = "상품 번호", required = true, example = "1")
            @RequestParam Long pdNo
    ) {
        ProductSelectRequestDTO productSelectRequestDTO = new ProductSelectRequestDTO();
        productSelectRequestDTO.setPdNo(pdNo);

        return productService.selectProductInfo(productSelectRequestDTO);
    }

    @ApiOperation(value = "상품 삽입", notes = "상품에 대한 정보를 삽입하는 API입니다.")
    @PostMapping("/info")
    public Boolean insertProductInfo(
            @ApiParam(name = "productInsertRequestDTO", value = "상품 삽입 객체 정보", required = true)
            @RequestBody ProductInsertRequestDTO productInsertRequestDTO
    ) {
        return productService.insertProductInfo(productInsertRequestDTO);
    }

    @ApiOperation(value = "상품 업데이트", notes = "상품에 대한 정보를 업데이트하는 API입니다.")
    @PutMapping("/info")
    public Boolean updateProductInfo(
            @ApiParam(name = "productUpdateRequestDTO", value = "상품 업데이트 객체 정보", required = true)
            @RequestBody ProductUpdateRequestDTO productUpdateRequestDTO
    ) {
        return productService.updateProductInfo(productUpdateRequestDTO);
    }

    @ApiOperation(value = "상품 상태 업데이트", notes = "상품에 대한 상태를 업데이트하는 API입니다.")
    @PutMapping("/state")
    public Boolean updateProductState(
            @ApiParam(name = "productUpdateStateRequestDTO", value = "상품 상태 업데이트 객체 정보", required = true)
            @RequestBody ProductUpdateStateRequestDTO productUpdateStateRequestDTO
    ) {
        return productService.updateProductState(productUpdateStateRequestDTO);
    }

    @ApiOperation(value = "상품 삭제", notes = "상품을 삭제하는 API입니다.")
    @DeleteMapping("/info")
    public Boolean deleteProductInfo(
            @ApiParam(name = "productDeleteRequestDTO", value = "상품 삭제 객체 정보", required = true)
            @RequestBody ProductDeleteRequestDTO productDeleteRequestDTO
    ) {
        return productService.deleteProductInfo(productDeleteRequestDTO);
    }

    @ApiOperation(value = "상품 키워드 리스트 조회" , notes = "상품에 대한 키워드 리스트 조회하는  API입니다.")
    @GetMapping("/keyword/info/list")
    public List<ProductKeywordInfoVO> selectKeywordInfoList() {
        return productService.selectProductKeywordInfoList();
    }

    @ApiOperation(value = "상품 키워드 조회" , notes = "상품에 대한 키워드를 조회하는 API입니다. ")
    @GetMapping("/keyword/info")
    public ProductKeywordInfoVO selectKeywordInfo(
            @ApiParam(name = "pdKeyword" , value = "상품 키워드" , required = true , example = "테스트")
            @RequestParam String pdKeyword
    ) {
        ProductKeywordSelectRequestDTO productKeywordSelectRequestDTO = new ProductKeywordSelectRequestDTO();
        productKeywordSelectRequestDTO.setPdKeyword(pdKeyword);

        return productService.selectProductKeywordInfo(productKeywordSelectRequestDTO);
    }

    @ApiOperation(value = "상품 키워드 삭제" , notes = "상품에 대한 키워드를 삭제하는 API입니다.")
    @DeleteMapping("/keyword/info")
    public Boolean deleteProductKeywordInfo(
            @ApiParam(name = "productKeywordDeleteRequestDTO" , defaultValue = "상품 키워드 삭제 객체 정보" , required = true)
            @RequestBody ProductKeywordDeleteRequestDTO productKeywordDeleteRequestDTO
    ) {
        return productService.deleteProductKeywordInfo(productKeywordDeleteRequestDTO);
    }

    @ApiOperation(value = "상품 조회수 리스트 조회" , notes = "상품 조회수에 대한 리스트를 조회하는 API입니다. ")
    @GetMapping("/view/info/list")
    public List<ProductViewInfoVO> selectProductViewInfoList() {
        return productService.selectProductViewInfoList();
    }
}
