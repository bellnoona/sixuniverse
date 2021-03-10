package com.yts8.sixuniverse.roomFacility.service;

import com.yts8.sixuniverse.roomFacility.dto.RoomFacilityDto;

import java.util.List;

public interface RoomFacilityService {
  void save(List<RoomFacilityDto> facilityDtos);

  List<RoomFacilityDto> findByRoomIdAndCategoryName(RoomFacilityDto roomFacilityDto);
}