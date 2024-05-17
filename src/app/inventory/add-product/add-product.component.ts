import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ProductService } from '../../services/product.service';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrl: './add-product.component.css'
})
export class AddProductComponent implements OnInit {

  constructor(private fb:FormBuilder, private ps:ProductService){}
  ProductForm:FormGroup;

  ngOnInit(): void {
    this.ProductForm = this.fb.group({
      productId:[],
      productName:[],
      productType:[],
      productPrice:[]

    })
    
  }

  onSubmit(){
    alert("product details saved")
    this.ps.saveProduct(this.ProductForm.value).subscribe();
  }

}
