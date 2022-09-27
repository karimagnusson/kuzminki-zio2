/*
* Copyright 2021 Kári Magnússon
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package kuzminki.filter

import java.sql.Date
import kuzminki.column.TypeCol
import kuzminki.assign._
import kuzminki.filter.types._
import kuzminki.fn.types._
import kuzminki.fn.Cast


trait DateMethods extends ComparativeMethods[Date] {

  // filters

  def century = ExtractCenturyFn(col)
  def decade = ExtractDecadeFn(col)
  def quarter = ExtractQuarterFn(col)
  def year = ExtractYearFn(col)
  def isoYear = ExtractIsoDowFn(col)
  def month = ExtractMonthFn(col)
  def week = ExtractWeekFn(col)
  def day = ExtractDayFn(col)
  def dow = ExtractDowFn(col)
  def isoDow = ExtractIsoDowFn(col)
  def doy = ExtractDoyFn(col)
  
  def asTimestamp = DateCastTimestampFn(col)
  def asString = Cast.asString(col)

  // update

  def setNow = TimestampNow(col)
  def +=(value: Int) = DateInc(col, value)
  def -=(value: Int) = DateDec(col, value)
}















