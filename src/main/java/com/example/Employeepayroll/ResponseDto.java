package com.example.Dto;

import lombok.Data;

@Data
public class ResponseDto {
	 String message;
     Object data;
public ResponseDto(String message, Object data) {
	        this.message = message;
	        this.data = data;
	    }
public ResponseDto() {
}

}


	//    public String getMessage() {
	//        return message;
	  //  }

	  //  public void setMessage(String message) {
	    //    this.message = message;
	    //}

	   // public Object getData() {
	     //   return data;
	   // }

	    //public void setData(Object data) {
	      //  this.data = data;
	    //}
//}
