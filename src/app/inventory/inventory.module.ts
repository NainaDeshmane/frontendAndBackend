import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { InventoryRoutingModule } from './inventory-routing.module';
import { AddProductComponent } from './add-product/add-product.component';
import { ViewProductComponent } from './view-product/view-product.component';
import { HeaderComponent } from './header/header.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HomeinventoryComponent } from './homeinventory/homeinventory.component';

console.log("Inventory module .........")
@NgModule({
  declarations: [
    AddProductComponent,
    ViewProductComponent,
    HeaderComponent,
    HomeinventoryComponent
  ],
  imports: [
    CommonModule,
    InventoryRoutingModule, ReactiveFormsModule
  ],
  exports:[AddProductComponent,
    ViewProductComponent,
    HeaderComponent]
})
export class InventoryModule { }
