package com.uds.horbac.core.resources;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Vue

{
    /** Attributes */
   
	@Id
    private Long id;
    /**
     * 
     */
    private String uri;
    /** Associations */
}

