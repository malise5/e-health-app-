package com.malise.app.bean;

import java.util.List;

import com.malise.app.model.entity.Ward;

public interface WardBeanI {

  List<Ward> getListOfWArd();

  String getWardTableHTML();

  Ward addWard(Ward ward);

  void deleteWard(Ward ward);

}
