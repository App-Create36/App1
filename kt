
Can't bind to 'ngModel' since it isn't a known property of 'input'.ngtsc(-998002)
kt-session.component.ts(5, 70): Error occurs in the template of component KtSessionComponent.

<p>kt-session works!</p>
<div class="container">
    <h2>KT Session Management</h2>
    <nav class="navbar">
      <button class="btn btn-primary" (click)="postKtSession()">Create KT Session</button>
      <button class="btn btn-secondary" (click)="getKtSessionById()">Get KT Session by ID</button>
      <button class="btn btn-info" (click)="getKtSessionByClientId()">Get KT Sessions by Client ID</button>
      <button class="btn btn-success" (click)="getClientsBySessionId()">Get Clients by Session ID</button>
    </nav>
  
    <!-- Form to Post KT Session -->
    <form #ktForm="ngForm" (ngSubmit)="submitKtSession()" class="kt-form">
      <div class="form-group">
        <label>Session Name:</label>
        <input type="text" [(ngModel)]="ktSession.sessionName" name="sessionName" class="form-control" required />
      </div>
      <div class="form-group">
        <label>Session Date:</label>
        <input type="date" [(ngModel)]="ktSession.sessionDate" name="sessionDate" class="form-control" required />
      </div>
      <div class="form-group">
        <label>Session Time:</label>
        <input type="time" [(ngModel)]="ktSession.sessionTime" name="sessionTime" class="form-control" required />
      </div>
      <div class="form-group">
        <label>Mentor Name:</label>
        <input type="text" [(ngModel)]="ktSession.mentorName" name="mentorName" class="form-control" required />
      </div>
      <div class="form-group">
        <label>Organizer ID:</label>
        <input type="text" [(ngModel)]="ktSession.organizerId" name="organizerId" class="form-control" required />
      </div>
      <button type="submit" class="btn btn-primary">Submit</button>
    </form>
  
    <!-- Table to Display KT Session Details -->
    <table class="table table-striped" *ngIf="ktSessionDetails">
      <thead>
        <tr>
          <th>Session ID</th>
          <th>Session Name</th>
          <th>Date</th>
          <th>Time</th>
          <th>Mentor</th>
          <th>Status</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>{{ktSessionDetails.sessionId}}</td>
          <td>{{ktSessionDetails.sessionName}}</td>
          <td>{{ktSessionDetails.sessionDate}}</td>
          <td>{{ktSessionDetails.sessionTime}}</td>
          <td>{{ktSessionDetails.mentorName}}</td>
          <td>{{ktSessionDetails.status}}</td>
        </tr>
      </tbody>
    </table>
  </div>
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  












// import { NgModule } from '@angular/core';
// import { BrowserModule } from '@angular/platform-browser';

// import { AppRoutingModule } from './app-routing.module';
// import { AppComponent } from './app.component';
// import { LoginComponent } from './pages/login/login.component';
// import { LayoutComponent } from './pages/layout/layout.component';
// import { UserListComponent } from './pages/user-list/user-list.component';
// import { CreateClientComponent } from './pages/create-client/create-client.component';
// import { HttpClient, provideHttpClient} from '@angular/common/http';
// @NgModule({
//   declarations: [
//     AppComponent,
   
   
//     UserListComponent,
//     CreateClientComponent
//   ],
//   imports: [
//     BrowserModule,
//     LoginComponent,
//     AppRoutingModule,
    
//   ],
//   providers: [
//     provideHttpClient()
//   ],
//   bootstrap: [AppComponent]
// })
// export class AppModule { }




import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
//import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './pages/login/login.component';
import { LayoutComponent } from './pages/layout/layout.component';
import { UserListComponent } from './pages/user-list/user-list.component';
import { CreateClientComponent } from './pages/create-client/create-client.component';
import { HttpClient, provideHttpClient} from '@angular/common/http';
import { VdiComponent } from './pages/vdi/vdi.component';
import { KtSessionComponent } from './pages/kt-session/kt-session.component';



const routes: Routes = [
  { path: 'create-client', component: CreateClientComponent },
  { path: '', redirectTo: '/create-client', pathMatch: 'full' }
];

@NgModule({
  declarations: [
    AppComponent,
   
   
    UserListComponent,
    CreateClientComponent,
     
    KtSessionComponent
    
  ],
  imports: [
    BrowserModule,
    LoginComponent,
    AppRoutingModule,
    FormsModule,
   
    VdiComponent,
    
    RouterModule.forRoot(routes)
    
  ],
  providers: [
    provideHttpClient()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }















X [ERROR] TS-996008: Component KtSessionComponent is standalone, and cannot be declared in an NgModule. Did you mean to import it instead? [plugin angular-compiler]    

    src/app/app.module.ts:65:4:
      65 │     KtSessionComponent
         ╵     ~~~~~~~~~~~~~~~~~~

<div class="container">
  <h2>KT Session Management</h2>
  <nav class="navbar">
    <button class="btn btn-primary" (click)="postKtSession()">Create KT Session</button>
    <button class="btn btn-secondary" (click)="getKtSessionById()">Get KT Session by ID</button>
    <button class="btn btn-info" (click)="getKtSessionByClientId()">Get KT Sessions by Client ID</button>
    <button class="btn btn-success" (click)="getClientsBySessionId()">Get Clients by Session ID</button>
  </nav>

  <!-- Form to Post KT Session -->
  <form #ktForm="ngForm" (ngSubmit)="submitKtSession()" class="kt-form">
    <div class="form-group">
      <label>Session Name:</label>
      <input type="text" [(ngModel)]="ktSession.sessionName" name="sessionName" class="form-control" required />
    </div>
    <div class="form-group">
      <label>Session Date:</label>
      <input type="date" [(ngModel)]="ktSession.sessionDate" name="sessionDate" class="form-control" required />
    </div>
    <div class="form-group">
      <label>Session Time:</label>
      <input type="time" [(ngModel)]="ktSession.sessionTime" name="sessionTime" class="form-control" required />
    </div>
    <div class="form-group">
      <label>Mentor Name:</label>
      <input type="text" [(ngModel)]="ktSession.mentorName" name="mentorName" class="form-control" required />
    </div>
    <div class="form-group">
      <label>Organizer ID:</label>
      <input type="text" [(ngModel)]="ktSession.organizerId" name="organizerId" class="form-control" required />
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>

  <!-- Table to Display KT Session Details -->
  <table class="table table-striped" *ngIf="ktSessionDetails">
    <thead>
      <tr>
        <th>Session ID</th>
        <th>Session Name</th>
        <th>Date</th>
        <th>Time</th>
        <th>Mentor</th>
        <th>Status</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>{{ktSessionDetails.sessionId}}</td>
        <td>{{ktSessionDetails.sessionName}}</td>
        <td>{{ktSessionDetails.sessionDate}}</td>
        <td>{{ktSessionDetails.sessionTime}}</td>
        <td>{{ktSessionDetails.mentorName}}</td>
        <td>{{ktSessionDetails.status}}</td>
      </tr>
    </tbody>
  </table>
</div>






























import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-kt-session',
  templateUrl: './kt-session.component.html',
  styleUrls: ['./kt-session.component.css']
})
export class KtSessionComponent {
  ktSession = {
    sessionName: '',
    sessionDate: '',
    sessionTime: '',
    mentorName: '',
    organizerId: ''
  };

  ktSessionDetails: any = null;
  private apiUrl = 'http://localhost:9083/api/kt-sessions';

  constructor(private http: HttpClient) {}

  // POST: Create a new KT Session
  submitKtSession() {
    this.http.post(this.apiUrl, this.ktSession).subscribe(response => {
      alert('KT session scheduled');
      this.ktSessionDetails = response;
    }, error => {
      alert('Error scheduling KT session');
      console.error(error);
    });
  }

  // GET: Fetch KT Session by ID
  getKtSessionById() {
    const sessionId = prompt('Enter Session ID:');
    if (sessionId) {
      this.http.get(`${this.apiUrl}/${sessionId}`).subscribe(response => {
        this.ktSessionDetails = response;
      }, error => {
        alert('Session not found');
        console.error(error);
      });
    }
  }

  // GET: Fetch KT Sessions by Client ID
  getKtSessionByClientId() {
    const clientId = prompt('Enter Client ID:');
    if (clientId) {
      this.http.get(`${this.apiUrl}/client/${clientId}`).subscribe(response => {
        this.ktSessionDetails = response;
      }, error => {
        alert('Client sessions not found');
        console.error(error);
      });
    }
  }

  // GET: Fetch Clients by Session ID
  getClientsBySessionId() {
    const sessionId = prompt('Enter Session ID:');
    if (sessionId) {
      this.http.get(`${this.apiUrl}/session/clients/${sessionId}`).subscribe(response => {
        this.ktSessionDetails = response;
      }, error => {
        alert('No clients found for this session');
        console.error(error);
      });
    }
  }
}















.container {
  max-width: 800px;
  margin: auto;
  padding: 20px;
  background-color: #f9f9f9;
  border-radius: 8px;
  box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
}

nav {
  display: flex;
  justify-content: space-around;
  margin-bottom: 20px;
}

button {
  padding: 10px 15px;
  font-size: 16px;
  background-color: #007bff;
  color: white;
  border: none;
  cursor: pointer;
  border-radius: 5px;
}

button:hover {
  background-color: #0056b3;
}

.form-group {
  margin-bottom: 15px;
}

label {
  font-weight: bold;
}

input {
  width: 100%;
  padding: 8px;
  margin-top: 5px;
  border: 1px solid #ccc;
  border-radius: 4px;
}

.table {
  margin-top: 20px;
  width: 100%;
  border-collapse: collapse;
}

.table th, .table td {
  padding: 10px;
  border: 1px solid #ddd;
  text-align: left;
}












import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { KtSessionComponent } from './kt-session/kt-session.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    KtSessionComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }














import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { KtSessionComponent } from './kt-session/kt-session.component';

const routes: Routes = [
  { path: 'kt-session', component: KtSessionComponent },
  { path: '', redirectTo: '/kt-session', pathMatch: 'full' } // Redirect to KT Session page by default
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }














<nav>
  <a routerLink="/kt-session">KT Session</a>
</nav>
<router-outlet></router-outlet>





  
