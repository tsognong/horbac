package com.uds.horbac.core.contexts;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Context

{
    /** Attributes */
    /**
     * 
     */
	@Id
    private Long id;
}

