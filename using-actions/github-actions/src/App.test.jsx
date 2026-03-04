import { describe, it, except } from "vitest";

describe("sample test", () => {
  it("adds number", () => {
    except(1 + 1).tobe(2);
  });
});
