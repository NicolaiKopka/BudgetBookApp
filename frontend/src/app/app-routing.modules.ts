import {NgModule} from "@angular/core";
import {RouterModule, Routes} from "@angular/router";
import {ExpenseFormComponent} from "./expense-form/expense-form.component";
import {FormComponent} from "./form/form.component";

const routes: Routes = [
  {path: '', component: FormComponent},
  {path: 'add-expense', component: ExpenseFormComponent}
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModules {}
