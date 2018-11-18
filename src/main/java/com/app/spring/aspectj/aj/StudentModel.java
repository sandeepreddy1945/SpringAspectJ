/**
 * 
 */
package com.app.spring.aspectj.aj;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Sandeep
 *
 */
@Getter
@Setter
@ToString(includeFieldNames = true)
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel {

    private String name;
    private String address;
    private String phoneNum;
    private String id;
}
