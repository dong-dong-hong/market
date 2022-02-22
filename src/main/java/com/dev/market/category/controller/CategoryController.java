package com.dev.market.category.controller;

import com.dev.market.category.model.dto.*;
import com.dev.market.category.model.vo.BottomCategoryInfoVO;
import com.dev.market.category.model.vo.TopCategoryInfoVO;
import com.dev.market.category.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = {"Category API"})
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @ApiOperation(value = "상위 카테고리 리스트 조회", notes = "상위 카테고리에 대한 정보 리스트를 조회하는 API입니다.")
    @GetMapping("/top/info/list")
    public List<TopCategoryInfoVO> selectTopCategoryInfoList() {
        return categoryService.selectTopCategoryInfoList();
    }

    @ApiOperation(value = "상위 카테고리 조회", notes = "상위 카테고리에 대한 정보를 조회하는 API입니다.")
    @GetMapping("/top/info")
    public TopCategoryInfoVO selectTopCategoryInfo(
            @ApiParam(name = "pdCt1No", value = "상위 카테고리 번호", required = true, example = "1")
            @RequestParam("pdCt1No") Long pdCt1No
    ) {
        TopCategorySelectRequestDTO topCategorySelectRequestDTO = new TopCategorySelectRequestDTO();
        topCategorySelectRequestDTO.setPdCt1No(pdCt1No);

        return categoryService.selectTopCategoryInfo(topCategorySelectRequestDTO);
    }

    @ApiOperation(value = "상위 카테고리 삽입", notes = "상위 카테고리에 대한 정보를 삽입하는 API입니다.")
    @PostMapping("/top/info")
    public Boolean insertTopCategoryInfo(
            @ApiParam(name = "topCategoryInsertRequestDTO", value = "상위 카테고리 삽입 객체 정보", required = true)
            @RequestBody TopCategoryInsertRequestDTO topCategoryInsertRequestDTO
    ) {
        return categoryService.insertTopCategoryInfo(topCategoryInsertRequestDTO);
    }

    @ApiOperation(value = "상위 카테고리 업데이트", notes = "상위 카테고리에 대한 정보를 업데이트하는 API입니다.")
    @PutMapping("/top/info")
    public Boolean updateTopCategoryInfo(
            @ApiParam(name = "topCategoryUpdateRequestDTO", value = "상위 카테고리 업데이트 객체 정보", required = true)
            @RequestBody TopCategoryUpdateRequestDTO topCategoryUpdateRequestDTO
    ) {
        return categoryService.updateTopCategoryInfo(topCategoryUpdateRequestDTO);
    }

    @ApiOperation(value = "상위 카테고리 상태 업데이트", notes = "상위 카테고리에 대한 상태를 업데이트하는 API입니다.")
    @PutMapping("/top/state")
    public Boolean updateTopCategoryState(
            @ApiParam(name = "topCategoryUpdateStateRequestDTO", value = "상위 카테고리 상태 업데이트 객체 정보", required = true)
            @RequestBody TopCategoryUpdateStateRequestDTO topCategoryUpdateStateRequestDTO
    ) {
        return categoryService.updateTopCategoryState(topCategoryUpdateStateRequestDTO);
    }

    @ApiOperation(value = "하위 카테고리 리스트 조회", notes = "하위 카테고리에 대한 정보 리스트를 조회하는 API입니다.")
    @GetMapping("/bottom/info/list")
    public List<BottomCategoryInfoVO> selectBottomCategoryInfoList() {
        return categoryService.selectBottomCategoryInfoList();
    }

    @ApiOperation(value = "하위 카테고리 조회", notes = "하위 카테고리에 대한 정보를 조회하는 API입니다.")
    @GetMapping("/bottom/info")
    public BottomCategoryInfoVO selectBottomCategoryInfo(
            @ApiParam(name = "pdCt2No", value = "하위 카테고리 번호", required = true, example = "1")
            @RequestParam("pdCt2No") Long pdCt2No
    ) {
        BottomCategorySelectRequestDTO bottomCategorySelectRequestDTO = new BottomCategorySelectRequestDTO();
        bottomCategorySelectRequestDTO.setPdCt2No(pdCt2No);

        return categoryService.selectBottomCategoryInfo(bottomCategorySelectRequestDTO);
    }

    @ApiOperation(value = "하위 카테고리 삽입", notes = "하위 카테고리에 대한 정보를 삽입하는 API입니다.")
    @PostMapping("/bottom/info")
    public Boolean insertBottomCategoryInfo(
            @ApiParam(name = "bottomCategoryInsertRequestDTO", value = "하위 카테고리 삽입 객체 정보", required = true)
            @RequestBody BottomCategoryInsertRequestDTO bottomCategoryInsertRequestDTO
    ) {
        return categoryService.insertBottomCategoryInfo(bottomCategoryInsertRequestDTO);
    }

    @ApiOperation(value = "하위 카테고리 업데이트", notes = "하위 카테고리에 대한 정보를 업데이트하는 API입니다.")
    @PutMapping("/bottom/info")
    public Boolean updateBottomCategoryInfo(
            @ApiParam(name = "bottomCategoryUpdateRequestDTO", value = "하위 카테고리 업데이트 객체 정보", required = true)
            @RequestBody BottomCategoryUpdateRequestDTO bottomCategoryUpdateRequestDTO
    ) {
        return categoryService.updateBottomCategoryInfo(bottomCategoryUpdateRequestDTO);
    }

    @ApiOperation(value = "하위 카테고리 상태 업데이트", notes = "하위 카테고리에 대한 상태를 업데이트하는 API입니다.")
    @PutMapping("/bottom/state")
    public Boolean updateBottomCategoryState(
            @ApiParam(name = "bottomCategoryUpdateStateRequestDTO", value = "하위 카테고리 상태 업데이트 객체 정보", required = true)
            @RequestBody BottomCategoryUpdateStateRequestDTO bottomCategoryUpdateStateRequestDTO
    ) {
        return categoryService.updateBottomCategoryState(bottomCategoryUpdateStateRequestDTO);
    }
}
