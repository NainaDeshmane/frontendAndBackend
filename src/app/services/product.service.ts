import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product } from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient) { }
  saveProduct(product:Product){
    return this.http.post("http://localhost:8880/Product/Product",product);
  }

getProduct(){
    return this.http.get("http://localhost:8880/Product/Products");
  }

deleteProduct(productId:number){
  return this.http.delete(`http://localhost:8880/Product/Product/${productId}`);
}
}
