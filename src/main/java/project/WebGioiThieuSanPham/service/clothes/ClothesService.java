package project.WebGioiThieuSanPham.service.clothes;


import project.WebGioiThieuSanPham.dto.ApiListBaseRequest;
import project.WebGioiThieuSanPham.dto.SearchByKeyword;
import project.WebGioiThieuSanPham.dto.clothesDto.request.ClothesRequest;
import project.WebGioiThieuSanPham.dto.clothesDto.response.BasePage;
import project.WebGioiThieuSanPham.dto.clothesDto.response.ClothesAvatarView;
import project.WebGioiThieuSanPham.dto.clothesDto.response.ClothesDetailView;
import project.WebGioiThieuSanPham.dto.clothesDto.response.ClothesResponse;
import project.WebGioiThieuSanPham.enums.Sex;

import java.math.BigDecimal;
import java.util.UUID;

public interface ClothesService {

     ClothesResponse updateClothes(UUID id,ClothesRequest clothesRequest);
     void deleteClothes(UUID id);
     ClothesDetailView getClothesById(UUID id);
     ClothesResponse createClothes(ClothesRequest clothesRequest);

     BasePage<ClothesAvatarView> search(ApiListBaseRequest apiListBaseRequest, SearchByKeyword searchRequest);

     BasePage<ClothesAvatarView> getAll(ApiListBaseRequest apiListBaseRequest);

     BasePage<ClothesAvatarView> getClothesBySex(ApiListBaseRequest apiListBaseRequest, Sex sex);

     BasePage<ClothesAvatarView> filterUtil(ApiListBaseRequest apiListBaseRequest, Sex sex, UUID categoryId, BigDecimal minPrice, BigDecimal maxPrice);
}
