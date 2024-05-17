import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ProductService } from '../../services/product.service';
import { Product } from '../../model/product';

@Component({
  selector: 'app-view-product',
  templateUrl: './view-product.component.html',
  styleUrl: './view-product.component.css'
})
export class ViewProductComponent  implements OnInit{

  constructor(private fb:FormBuilder, private ps :ProductService){}
product:Product[]

  ngOnInit(): void {
    
    this.ps.getProduct().subscribe((prod:Product[])=>{
      this.product=prod
    })
  

  }
  deleteProduct(productId:number){
    alert("Are you sure ")
    this.ps.deleteProduct(productId).subscribe();
  
  }
  

}
