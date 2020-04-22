package by.strizhonov.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CityDto {

    private long id;

    private String name;

    private String description;

    private List<ShowplaceDto> showplaces;

}
