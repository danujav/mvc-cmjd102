package lk.ijse.mvc.dto;

/*
    @author DanujaV
    @created 10/7/23 - 4:30 PM   
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDTO {
    private String id;
    private String name;
    private String address;
    private String tel;
}
