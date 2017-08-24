package com.bingobox.basedata.service.api;

import com.bingobox.basedata.dto.BoxDTO;

import java.util.List;

/**
 * Created by zhangfubin on 2017/7/5.
 */
public interface BoxServiceApi {
    BoxDTO getBoxById(Long boxId) throws Exception;

    List<BoxDTO> listBoxByParam(BoxDTO boxDTO) throws Exception;
}
