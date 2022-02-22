package com.dev.market.category.service;

import com.dev.market.category.model.dao.CategoryDAO;
import com.dev.market.category.model.dto.*;
import com.dev.market.category.model.vo.BottomCategoryInfoVO;
import com.dev.market.category.model.vo.TopCategoryInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryDAO categoryDAO;

    @Override
    public List<TopCategoryInfoVO> selectTopCategoryInfoList() {
        return categoryDAO.selectTopCategoryInfoList();
    }

    @Override
    public TopCategoryInfoVO selectTopCategoryInfo(TopCategorySelectRequestDTO topCategorySelectRequestDTO) {
        return categoryDAO.selectTopCategoryInfo(topCategorySelectRequestDTO);
    }

    @Override
    public Boolean insertTopCategoryInfo(TopCategoryInsertRequestDTO topCategoryInsertRequestDTO) {
        return categoryDAO.insertTopCategoryInfo(topCategoryInsertRequestDTO) == 1;
    }

    @Override
    public Boolean updateTopCategoryInfo(TopCategoryUpdateRequestDTO topCategoryUpdateRequestDTO) {
        return categoryDAO.updateTopCategoryInfo(topCategoryUpdateRequestDTO) == 1;
    }

    @Override
    public Boolean updateTopCategoryState(TopCategoryUpdateStateRequestDTO topCategoryUpdateStateRequestDTO) {
        return categoryDAO.updateTopCategoryState(topCategoryUpdateStateRequestDTO) == 1;
    }

    @Override
    public List<BottomCategoryInfoVO> selectBottomCategoryInfoList() {
        return categoryDAO.selectBottomCategoryInfoList();
    }

    @Override
    public BottomCategoryInfoVO selectBottomCategoryInfo(BottomCategorySelectRequestDTO bottomCategorySelectRequestDTO) {
        return categoryDAO.selectBottomCategoryInfo(bottomCategorySelectRequestDTO);
    }

    @Override
    public Boolean insertBottomCategoryInfo(BottomCategoryInsertRequestDTO bottomCategoryInsertRequestDTO) {
        return categoryDAO.insertBottomCategoryInfo(bottomCategoryInsertRequestDTO) == 1;
    }

    @Override
    public Boolean updateBottomCategoryInfo(BottomCategoryUpdateRequestDTO bottomCategoryUpdateRequestDTO) {
        return categoryDAO.updateBottomCategoryInfo(bottomCategoryUpdateRequestDTO) == 1;
    }

    @Override
    public Boolean updateBottomCategoryState(BottomCategoryUpdateStateRequestDTO bottomCategoryUpdateStateRequestDTO) {
        return categoryDAO.updateBottomCategoryState(bottomCategoryUpdateStateRequestDTO) == 1;
    }
}
