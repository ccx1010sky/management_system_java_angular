import { Component, OnInit } from '@angular/core';

import { Employee } from '../employee';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css'],
})
export class EmployeeListComponent implements OnInit {
  employees: Employee[];

  constructor() {}

  ngOnInit(): void {
    // adding dummy data
    this.employees = [
      {
        id: 1,
        firstName: 'Michael',
        lastName: 'Jackson',
        emailId: 'michael@gmail.com',
      },
      {
        id: 2,
        firstName: 'John',
        lastName: 'Conner',
        emailId: 'john@gmail.com',
      },
    ];
  }
}
