import {Injectable} from '@angular/core';
import {IDropdownValues} from '../Models/IDropdownValues';

@Injectable()
export class DataService {

  GetAgeOptions(): IDropdownValues[] {
    return [
      {value: 17, viewValue: '0-17'},
      {value: 64, viewValue: '18-64'},
      {value: 66, viewValue: '65+'},
    ];
  }

  GetIncomeOptions(): IDropdownValues[] {
    return [
      {value: 0, viewValue: '0'},
      {value: 12000, viewValue: '1-12000'},
      {value: 40000, viewValue: '12001-40000'},
      {value: 100001, viewValue: '40001+'},
    ];
  }
}
