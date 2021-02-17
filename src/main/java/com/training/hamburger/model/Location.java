/**
 * 
 */
package com.training.hamburger.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Pranav
 *
 */

@Document(collection = "locations")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
	@Id
	private String locationId;
	private String name;
	private String latitude;
	private String longitude;
	private String address;
	private String phone;
	
	
}
