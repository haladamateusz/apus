/*
 * Apus - A social wall for conferences with additional features.
 * Copyright (C) Marcus Fihlon and the individual contributors to Apus.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package swiss.fihlon.apus.conference;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

public record Session(String id, LocalDateTime startDate, LocalDateTime endDate, String room, String title, String speaker)
        implements Comparable<Session> {
    @Override
    public int compareTo(@NotNull final Session other) {
        final var dateCompareResult = startDate.compareTo(other.startDate);
        if (dateCompareResult == 0) {
            return room.compareTo(other.room);
        }
        return dateCompareResult;
    }
}
