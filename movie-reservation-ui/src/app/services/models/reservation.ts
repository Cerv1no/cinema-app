/* tslint:disable */
/* eslint-disable */
/* Code generated by ng-openapi-gen DO NOT EDIT. */

import { Seat } from '../models/seat';
import { Showtime } from '../models/showtime';
import { User } from '../models/user';
export interface Reservation {
  id?: number;
  reservationDate?: string;
  seats?: Array<Seat>;
  showtime?: Showtime;
  user?: User;
}
