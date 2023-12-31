package project.WebGioiThieuSanPham.dto.categoryDto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.WebGioiThieuSanPham.dto.clothesDto.response.ClothesResponse;

import java.util.List;
import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryResponse {
    protected UUID id;
    private String name;
}
