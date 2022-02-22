package com.dev.market.category.service;

import com.dev.market.category.model.dto.*;
import com.dev.market.category.model.vo.BottomCategoryInfoVO;
import com.dev.market.category.model.vo.TopCategoryInfoVO;

import java.util.List;

public interface CategoryService {
    List<TopCategoryInfoVO> selectTopCategoryInfoList();
    TopCategoryInfoVO selectTopCategoryInfo(TopCategorySelectRequestDTO topCategorySelectRequestDTO);
    Boolean insertTopCategoryInfo(TopCategoryInsertRequestDTO topCategoryInsertRequestDTO);
    Boolean updateTopCategoryInfo(TopCategoryUpdateRequestDTO topCategoryUpdateRequestDTO);
    Boolean updateTopCategoryState(TopCategoryUpdateStateRequestDTO topCategoryUpdateStateRequestDTO);
    List<BottomCategoryInfoVO> selectBottomCategoryInfoList();
    BottomCategoryInfoVO selectBottomCategoryInfo(BottomCategorySelectRequestDTO bottomCategorySelectRequestDTO);
    Boolean insertBottomCategoryInfo(BottomCategoryInsertRequestDTO bottomCategoryInsertRequestDTO);
    Boolean updateBottomCategoryInfo(BottomCategoryUpdateRequestDTO bottomCategoryUpdateRequestDTO);
    Boolean updateBottomCategoryState(BottomCategoryUpdateStateRequestDTO bottomCategoryUpdateStateRequestDTO);
}
