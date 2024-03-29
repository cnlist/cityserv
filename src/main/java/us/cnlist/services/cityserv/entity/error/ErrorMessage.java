package us.cnlist.services.cityserv.entity.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage implements Serializable {
    private String exceptionName;
    private String errorMessage;

}
