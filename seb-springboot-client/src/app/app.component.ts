import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {DataService} from './services/data.service';
import {IDropdownValues} from './Models/IDropdownValues';
import {ApiService} from './services/api.service';
import {IPersonAnswers} from './services/IPersonAnswers';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'seb-springboot-client';
  formMain: FormGroup;
  ageOptions: IDropdownValues[];
  incomeOptions: IDropdownValues[];
  submitted = false;
  productsResult: string[] = [];
  private showMessage: boolean;

  constructor(private formBuilder: FormBuilder,
              private dataService: DataService,
              private apiService: ApiService) {
  }

  ngOnInit() {
    this.ageOptions = this.dataService.GetAgeOptions();
    this.incomeOptions = this.dataService.GetIncomeOptions();
    this.formMain = this.formBuilder.group({
      age: ['', Validators.required],
      isStudent: [''],
      income: ['', Validators.required],
    });
  }

  onSubmit() {
    this.submitted = true;
    this.productsResult = [];

    // stop here if form is invalid
    if (this.formMain.invalid) {
      this.showMessage = true;
      return;
    }

    this.showMessage = false;
    this.CallApi();

  }

  CallApi() {
    const answers: IPersonAnswers = {
      age: this.formMain.controls.age.value,
      isStudent: this.formMain.controls.isStudent.value,
      income: this.formMain.controls.income.value,
    };
    this.apiService.getProducts(answers).then(data => {
      this.productsResult.push(data);
    });
  }
}
