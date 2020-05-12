package ma.observatoire.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.observatoire.entitie.Province;

public interface ProvinceDao extends JpaRepository<Province, Integer> {
Province  findByProvince(String province);
}
