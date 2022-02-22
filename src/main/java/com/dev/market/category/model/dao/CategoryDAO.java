package com.dev.market.category.model.dao;

import com.dev.market.category.model.dto.*;
import com.dev.market.category.model.vo.BottomCategoryInfoVO;
import com.dev.market.category.model.vo.TopCategoryInfoVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryDAO {
    List<TopCategoryInfoVO> selectTopCategoryInfoList();
    TopCategoryInfoVO selectTopCategoryInfo(TopCategorySelectRequestDTO topCategorySelectRequestDTO);
    Integer insertTopCategoryInfo(TopCategoryInsertRequestDTO topCategoryInsertRequestDTO);
    Integer updateTopCategoryInfo(TopCategoryUpdateRequestDTO topCategoryUpdateRequestDTO);
    Integer updateTopCategoryState(TopCategoryUpdateStateRequestDTO topCategoryUpdateStateRequestDTO);
    List<BottomCategoryInfoVO> selectBottomCategoryInfoList();
    BottomCategoryInfoVO selectBottomCategoryInfo(BottomCategorySelectRequestDTO bottomCategorySelectRequestDTO);
    Integer insertBottomCategoryInfo(BottomCategoryInsertRequestDTO bottomCategoryInsertRequestDTO);
    Integer updateBottomCategoryInfo(BottomCategoryUpdateRequestDTO bottomCategoryUpdateRequestDTO);
    Integer updateBottomCategoryState(BottomCategoryUpdateStateRequestDTO bottomCategoryUpdateStateRequestDTO);
}
