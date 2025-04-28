package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelQuasimodichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r16;

    public ModelQuasimodichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.5F, -10.0F, -5.0F, 7, 7, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -3.5F, 1.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1658F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 15, -2.5F, -5.15F, -5.925F, 6, 7, 8, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -12.0948F, -0.259F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2793F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 24, -2.5F, 0.0021F, -6.0112F, 6, 4, 6, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -8.5F, 9.5F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2443F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 44, -2.5F, -1.125F, -10.35F, 6, 3, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -3.5F, -6.0F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 42, 30, -2.5F, -4.125F, -3.0F, 6, 4, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 47, 17, -1.5F, -0.125F, -3.0F, 4, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 2.55F, -3.75F, -3.5F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -2.55F, -3.75F, -3.5F, 1, 1, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 0, 15, 2.525F, -4.25F, -4.0F, 1, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 15, -2.525F, -4.25F, -4.0F, 1, 2, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -7.0F, 0.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5585F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 0, -1.5F, 0.05F, -6.05F, 5, 4, 6, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -3.8F, -5.1F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2487F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 0, -1.5F, 0.0325F, 0.0158F, 5, 3, 3, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, -0.125F, -3.0F);
        this.head.addChild(jaw);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 1.0F, 0.0F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2487F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 0, -1.5F, -1.0F, -3.0F, 4, 1, 3, -0.01F, false));

        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -7.0236F, 2.9672F);
        this.main.addChild(upperbody);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 25, 10, -3.0F, -2.9764F, -0.9672F, 6, 7, 5, 0.02F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 7.0465F, 1.2939F);
        this.upperbody.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 46, 38, -2.0F, -3.976F, 0.6604F, 5, 3, 3, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 3.5236F, -1.9672F);
        this.upperbody.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1658F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 51, -2.0F, -1.225F, 1.075F, 5, 3, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -1.4764F, 6.5328F);
        this.upperbody.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2443F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 22, -2.0F, -1.025F, -7.35F, 5, 3, 5, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(2.5F, 4.5465F, 1.2939F);
        this.upperbody.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, -0.9599F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backleftfin.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3927F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.0F, 0.0F, 0.0F, 0, 4, 3, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-2.5F, 4.5465F, 1.2939F);
        this.upperbody.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, 0.9599F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backrightfin.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3927F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, 0.0F, 0.0F, 0, 4, 3, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.5871F, 3.6772F);
        this.upperbody.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 18, 34, -2.5F, -2.0635F, -0.1443F, 5, 5, 5, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -2.0635F, 2.8557F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2443F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 38, -1.5F, -0.9F, -3.35F, 4, 3, 6, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.5529F, 2.3485F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2225F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 47, 10, -2.0F, -1.4F, -2.0F, 4, 3, 4, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -2.0635F, 2.8557F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3752F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 41, 0.5F, -5.7F, -2.35F, 0, 5, 6, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.6865F, 4.6057F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 20, 44, -2.0F, -3.0F, -0.25F, 4, 6, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 26, 49, 0.0F, 3.0F, -0.25F, 0, 6, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.5F, 3.75F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 43, 47, -1.0F, -1.5F, -1.0F, 2, 4, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 21, 0.0F, -7.0F, 2.0F, 0, 14, 9, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(3.25F, -3.2271F, -4.7389F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, -1.0036F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontleftfin.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3503F, 0.082F, 0.2481F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 49, 0.0F, -1.0F, 0.0F, 0, 6, 5, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-3.25F, -3.2271F, -4.7389F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, 1.0036F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontrightfin.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3503F, -0.082F, -0.2481F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 16, 49, 0.0F, -1.0F, 0.0F, 0, 6, 5, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.2F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(upperbody, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.1F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetZ = -0.4F;
        this.main.offsetY = -0.19F;
        this.main.offsetX = -0.06F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(upperbody, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.1F, 0.0F);
        this.main.offsetY = -0.3F;
        this.main.render(0.01F);
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
        this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body, this.tail, this.tail2};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(frontleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontrightfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(backleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(backrightfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(backrightfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(main, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.08F;
                this.bob(main, speed, 3F, false, f2, 1);
            }
        }
    }
}
