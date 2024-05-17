import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddProductComponent } from './add-product/add-product.component';
import { ViewProductComponent } from './view-product/view-product.component';
import { HomeinventoryComponent } from './homeinventory/homeinventory.component';

const routes: Routes = [
  {path:'',component:HomeinventoryComponent},
  {path:'add',component:AddProductComponent},
  {path:"view",component:ViewProductComponent},
  {path:"edit/:data",component:AddProductComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class InventoryRoutingModule { }
