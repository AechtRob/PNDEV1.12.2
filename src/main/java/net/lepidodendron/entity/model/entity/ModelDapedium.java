package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDapedium extends AdvancedModelBase {
    private final AdvancedModelRenderer Dapedium;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer VentralR;
    private final AdvancedModelRenderer VentralL;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r17;

    public ModelDapedium() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Dapedium = new AdvancedModelRenderer(this);
        this.Dapedium.setRotationPoint(-1.0F, 18.0F, -1.0F);


        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(1.0F, -1.0F, -3.0F);
        this.Dapedium.addChild(Body1);
        this.setRotateAngle(Body1, -0.1484F, 0.0F, 0.0F);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -2.0F, -5.7F, 0.0F, 4, 11, 8, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 9, 52, 0.0F, -10.6F, 6.2F, 0, 6, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.Body1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1396F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 26, -1.5F, -0.7F, 0.0F, 3, 2, 8, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(2.05F, 0.6F, 1.75F);
        this.Body1.addChild(PectoralR);
        this.setRotateAngle(PectoralR, 0.0F, 0.3491F, 0.0F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 20, 34, -0.05F, -1.0F, 0.05F, 0, 3, 3, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(-2.05F, 0.6F, 1.75F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.0F, -0.3491F, 0.0F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 20, 34, 0.05F, -1.0F, 0.05F, 0, 3, 3, 0.0F, true));

        this.VentralR = new AdvancedModelRenderer(this);
        this.VentralR.setRotationPoint(1.9F, 3.5F, 3.35F);
        this.Body1.addChild(VentralR);
        this.setRotateAngle(VentralR, -0.4363F, 0.1309F, 0.0F);
        this.VentralR.cubeList.add(new ModelBox(VentralR, 51, 49, 0.1F, -0.5F, 0.05F, 0, 2, 3, 0.0F, false));

        this.VentralL = new AdvancedModelRenderer(this);
        this.VentralL.setRotationPoint(-1.9F, 3.5F, 3.35F);
        this.Body1.addChild(VentralL);
        this.setRotateAngle(VentralL, -0.4363F, -0.1309F, 0.0F);
        this.VentralL.cubeList.add(new ModelBox(VentralL, 51, 49, -0.1F, -0.5F, 0.05F, 0, 2, 3, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -0.2F, 8.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 28, 42, 0.0F, -10.4F, 0.2F, 0, 6, 6, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 27, 27, 0.0F, 0.5F, -0.8F, 0, 7, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.1F, 3.7F, 4.4F);
        this.Body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.7941F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 7, -1.1F, -3.1389F, 0.718F, 2, 4, 3, -0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 5.6F, -0.1F);
        this.Body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2793F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 16, -0.5F, -4.1F, -0.1F, 3, 4, 6, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.1F, -4.7F, 4.0F);
        this.Body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.5585F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 51, 25, -1.1F, -1.0858F, 1.1965F, 2, 3, 2, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -6.3F, -0.2F);
        this.Body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 36, -0.5F, -0.2475F, -0.1128F, 3, 3, 6, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 0.1F, 0.1F);
        this.Body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 0, -0.5F, -5.0F, -0.7F, 3, 9, 6, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(8.0F, -4.7F, -6.1F);
        this.Body2.addChild(bone);


        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.8F, 6.2F);
        this.Body2.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 0, 0.0F, -5.7F, 0.0F, 0, 4, 3, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 25, 0.0F, 1.05F, 0.0F, 0, 5, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 1.9F, 0.4F);
        this.Tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5934F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 47, 15, 0.0F, -0.9697F, 0.2182F, 2, 2, 3, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -2.4F, -0.3F);
        this.Tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5061F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 42, 0.0F, -1.3F, 0.35F, 2, 2, 3, -0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.Tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1396F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 12, 1.0F, -6.5F, 3.8F, 0, 13, 8, 0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 42, 0.0F, -1.5F, -1.2F, 2, 3, 6, 0.0F, false));

        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(1.0F, -1.0F, -3.25F);
        this.Dapedium.addChild(Cephalon);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -3.7F, -1.75F);
        this.Cephalon.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5236F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 27, -1.5F, -0.1F, -0.8F, 3, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.0F, -4.75F);
        this.Cephalon.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.0647F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 48, -1.5F, -3.0F, -0.2F, 3, 3, 2, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 1.0F, -4.75F);
        this.Cephalon.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2793F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 16, 0.0F, -0.7F, -0.9F, 2, 1, 2, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 32, -0.5F, -3.0F, -1.0F, 3, 3, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 3.0F, -2.75F);
        this.Cephalon.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6458F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 41, 46, -0.5F, -1.6F, 0.1F, 3, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, -4.75F);
        this.Cephalon.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6109F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 20, -2.0F, -0.1F, 0.3F, 4, 1, 3, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 1.0F, -2.75F);
        this.Cephalon.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1222F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 37, -1.5F, -4.6F, 0.0F, 5, 7, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 0.0F, -4.75F);
        this.Cephalon.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1222F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 45, 0, -1.0F, -2.0F, 0.0F, 4, 3, 3, -0.01F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.1F, -3.0F);
        this.Cephalon.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.2618F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 49, 38, -1.0F, -0.3F, -2.75F, 2, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.9052F, -1.65F);
        this.Jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0175F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 17, 0, -1.5F, -0.9451F, -1.1552F, 3, 1, 4, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Dapedium.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Dapedium.rotateAngleY = (float) Math.toRadians(90);
        this.Dapedium.rotateAngleX = (float) Math.toRadians(0);
        this.Dapedium.offsetY = -0.18F;
        this.Dapedium.offsetX = -0.04F;
        this.Dapedium.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Dapedium, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, -0.1485F, 0.0432F, -0.0065F);
        this.setRotateAngle(cube_r1, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralR, 0.0F, 0.9163F, 0.0F);
        this.setRotateAngle(PectoralL, 0.0F, -1.1345F, 0.0F);
        this.setRotateAngle(VentralR, -0.4826F, 0.4445F, -0.1608F);
        this.setRotateAngle(VentralL, -0.4928F, -0.483F, 0.1837F);
        this.setRotateAngle(Body2, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(cube_r2, 0.7941F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(cube_r7, 0.5934F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.5061F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -1.0647F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0175F, 0.0F, 0.0F);
        this.Dapedium.rotateAngleY = (float) Math.toRadians(90);
        this.Dapedium.offsetY = -0.4F;
        this.Dapedium.offsetX = -0F;
        this.Dapedium.offsetZ = 0.03F;
        this.Dapedium.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.Dapedium.offsetY = 1.15F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Tail};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.5F, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(PectoralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PectoralR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(VentralL, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(VentralL, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(VentralR, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(VentralR, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);


            this.swing(Dapedium, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Dapedium.rotateAngleZ = (float) Math.toRadians(90);
                //this.Dapedium.offsetY = 1.15F;
                this.bob(Dapedium, -speed, 5F, false, f2, 1);
            }
        }
    }
}
