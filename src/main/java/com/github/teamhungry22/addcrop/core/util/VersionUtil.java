package com.github.teamhungry22.addcrop.core.util;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;

import java.util.List;

public class VersionUtil {
    /**
     * 현재 버전이 특정 버전과 정확히 같은지 확인합니다.
     *
     * @param versionToCheck 비교할 버전 문자열 (예: "1.20.1")
     * @return 예: 현재 버전이 1.20.1일 때 is("1.20.1") → true
     */
    public static boolean is(String versionToCheck) {
        throw new AddCropNotFoundException();
    }

    /**
     * 현재 버전이 지정한 최소 버전 이상인지 확인합니다.
     *
     * @param minVersion 최소 버전 문자열 (예: "1.18")
     * @return 예: 현재 버전이 1.20.1이면 isAtLeast("1.18") → true
     */
    public static boolean isAtLeast(String minVersion) {
        throw new AddCropNotFoundException();
    }

    /**
     * 현재 버전이 지정한 최대 버전 이하인지 확인합니다.
     *
     * @param maxVersion 최대 버전 문자열 (예: "1.19.4")
     * @return 예: 현재 버전이 1.18이면 isAtMost("1.19.4") → true
     */
    public static boolean isAtMost(String maxVersion) {
        throw new AddCropNotFoundException();
    }

    /**
     * 현재 버전이 지정한 버전 범위 내에 있는지 확인합니다.
     *
     * @param minVersion 최소 버전 (포함)
     * @param maxVersion 최대 버전 (포함)
     * @return 예: 현재 버전이 1.19.4이면 isBetween("1.18", "1.20") → true
     */
    public static boolean isBetween(String minVersion, String maxVersion) {
        throw new AddCropNotFoundException();
    }

    /**
     * 현재 서버의 마인크래프트 버전을 반환합니다.
     *
     * @return 예: "1.20.1"
     */
    public static String getCurrentVersion() {
        throw new AddCropNotFoundException();
    }

    /**
     * 두 버전 문자열을 비교합니다.
     *
     * @param v1 버전1 (예: "1.20.1")
     * @param v2 버전2 (예: "1.18.2")
     * @return 예:
     *         - v1 > v2 → 양수 (예: "1.20.1", "1.18" → 1)
     *         - v1 = v2 → 0 (예: "1.18.0", "1.18" → 0)
     *         - v1 < v2 → 음수 (예: "1.16.5", "1.18" → -1)
     */
    private static int compareVersions(String v1, String v2) {
        throw new AddCropNotFoundException();
    }

    /**
     * 버전 문자열을 숫자 리스트로 파싱합니다.
     *
     * @param versionString 예: "1.20.1"
     * @return 예: [1, 20, 1]
     */
    private static List<Integer> parseVersion(String versionString) {
        throw new AddCropNotFoundException();
    }
}
