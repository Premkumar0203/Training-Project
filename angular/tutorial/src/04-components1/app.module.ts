import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";
import { HeaderComponent } from './components/header/header.component';
import { ButtonComponent } from './components/button/button.component';


@NgModule({
  declarations: [AppComponent, HeaderComponent, ButtonComponent], // comp, direct, pipe
  imports: [BrowserModule], // other modules (app)
  bootstrap: [AppComponent]

})
export class AppModule{}

