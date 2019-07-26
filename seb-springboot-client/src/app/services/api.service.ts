import {environment} from '../../environments/environment';
import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {IPersonAnswers} from './IPersonAnswers';


/***
 * Api url
 */
const API_URL = environment.protocol + '://' + window.location.hostname + ':' + environment.port;

@Injectable()
export class ApiService {
  constructor(
    private http: HttpClient,
  ) {
  }

  async getProducts(personAnswers: IPersonAnswers): Promise<any> {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json',
      })
    };
    return await this.http.post(`${API_URL}/products`, personAnswers, httpOptions).toPromise();
  }
}
