package ProgramCreek.Array_String.BinarySearch;

public class FirstBadVersion {

    private static boolean isBadVersion(int version) {
        return version >= 9;
    }

    public int firstBadVersion(int currVersion) {

        int left = 1;
        int right = currVersion;
        int mid;
        while (left < right) {
            mid = (left + right) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        if (isBadVersion(left)) {
            return left;
        }

        return right;
    }
}
