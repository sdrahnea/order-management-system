package com.oms.contextHolder;

/**
 *
 * @author sdrahnea
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.faces.bean.ManagedBean;

@ManagedBean
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HelloWorld {

    private String firstName="";
    private String lastName="";

    public String showGreeting(){
        return "Hi "+firstName+" "+lastName;
    }
}
