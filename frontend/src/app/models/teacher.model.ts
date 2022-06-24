import { Base } from './base.model';
import { getUserDisplay, User } from '@models/user.model';

export interface Teacher extends Base {
  user: User;
}

export function getTeacherDisplay(teacher: Teacher): string {
  return getUserDisplay(teacher.user);
}
