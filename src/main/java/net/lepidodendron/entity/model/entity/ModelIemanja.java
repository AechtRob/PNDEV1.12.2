package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelIemanja extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer lip;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cheek;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail3;

    public ModelIemanja() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -16.0F, 1.0F, 4, 12, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 33, 51, 0.0F, -20.75F, 5.975F, 0, 5, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 0, 0.0F, -3.6F, 7.0F, 0, 3, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -1.2743F, 4.787F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 0, -0.5F, -3.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -2.0507F, 7.6848F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 28, -0.5F, -3.0F, -3.0F, 3, 3, 3, 0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -4.0F, 10.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5672F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 44, -0.5F, -2.6F, -3.0F, 3, 3, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -17.8767F, 2.8626F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5672F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 12, -0.5F, 0.0F, -4.0F, 3, 3, 4, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -18.0511F, 6.8588F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 36, -0.5F, 0.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -16.75F, 10.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 36, -0.5F, 0.0F, -3.4F, 3, 3, 4, -0.001F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.5F, -2.1007F, 4.1848F);
        this.body.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, -0.3054F, 0.0F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 13, 27, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.5F, -2.1007F, 4.1848F);
        this.body.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.3054F, 0.0F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 13, 27, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.2743F, 4.787F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 22, -1.5F, -12.7257F, -6.787F, 3, 10, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 47, 48, -1.0F, -10.1257F, -9.787F, 2, 4, 3, -0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 51, 60, -0.5F, -7.1257F, -9.812F, 1, 1, 0, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 34, 20, -1.0F, -6.9257F, -8.787F, 2, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 52, 4, -0.5F, -8.7257F, -13.787F, 1, 1, 4, 0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -7.7257F, -13.787F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 36, -0.5F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -9.6202F, -10.3591F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2662F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 52, -0.5F, 0.125F, -3.0F, 1, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -11.7508F, -8.247F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7636F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 45, 8, -0.5F, 0.0F, -4.0F, 1, 3, 4, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -14.4532F, -5.2979F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.7418F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 44, -0.5F, 0.0F, -4.0F, 2, 3, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.6429F, -7.2614F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.9599F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 49, 16, -0.5F, -2.0F, -4.0F, 1, 2, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -0.3486F, -3.9848F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6109F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 44, -0.5F, -3.0F, -4.0F, 2, 3, 4, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(-0.025F, -10.557F, -6.6795F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.5672F, -0.1745F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 13, 22, -1.475F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 0, 36, -1.525F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(0.025F, -10.557F, -6.6795F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.5672F, 0.1745F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 13, 22, 0.475F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 36, 0.525F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-1.9234F, -4.7825F, -3.5892F);
        this.head.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.3171F, -0.8035F, -0.232F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 0, 0, 0.0F, -1.0F, 0.0F, 0, 3, 4, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(1.9234F, -4.7825F, -3.5892F);
        this.head.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.3171F, 0.8035F, 0.232F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 0, 0, 0.0F, -1.0F, 0.0F, 0, 3, 4, 0.0F, true));

        this.lip = new AdvancedModelRenderer(this);
        this.lip.setRotationPoint(0.0F, -7.7257F, -13.787F);
        this.head.addChild(lip);
        this.lip.cubeList.add(new ModelBox(lip, 21, 60, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.02F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -6.4381F, -8.437F);
        this.head.addChild(jaw);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -1.2876F, -5.3499F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3447F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 33, 0, -0.5F, -0.7F, 4.0F, 2, 1, 2, 0.001F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 50, 40, 0.0F, -0.7F, 0.0F, 1, 1, 4, -0.001F, false));

        this.cheek = new AdvancedModelRenderer(this);
        this.cheek.setRotationPoint(0.0F, -0.7376F, -3.7499F);
        this.jaw.addChild(cheek);
        this.setRotateAngle(cheek, -0.3927F, 0.0F, 0.0F);
        this.cheek.cubeList.add(new ModelBox(cheek, 10, 58, -0.475F, -2.0F, 0.0F, 0, 2, 3, 0.0F, false));
        this.cheek.cubeList.add(new ModelBox(cheek, 10, 58, 0.475F, -2.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -10.2061F, 10.0798F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 13, 27, 0.0F, 1.6061F, -0.0798F, 0, 9, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 13, 42, -1.5F, -3.7939F, -0.0798F, 3, 8, 2, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 14, 43, -1.5F, -3.7939F, -1.0798F, 3, 8, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 27, 0, 0.0F, -11.3189F, -0.1048F, 0, 10, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -6.3189F, 0.4702F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.0472F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 39, 20, -0.5F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 6.2061F, -0.0798F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.7854F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 29, 27, -0.5F, -2.6F, -0.1F, 2, 3, 5, -0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1178F, 1.7824F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 51, -1.0F, -0.9117F, -0.8621F, 2, 2, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.95F, 0.5383F, 2.4879F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.3963F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 25, 0, -1.0F, -3.2F, -2.4F, 1, 3, 2, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 25, 0, -1.9F, -3.2F, -2.4F, 1, 3, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.45F, -0.9117F, 2.1879F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.7418F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 58, -0.5F, -3.0F, -2.0F, 1, 3, 2, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 58, -1.4F, -3.0F, -2.0F, 1, 3, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0883F, 3.1379F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 27, 17, -0.5F, -0.5F, -1.0F, 1, 1, 3, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 21, 16, 0.0F, -4.5F, 0.0F, 0, 9, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.65F;
        this.main.offsetX = 0.238F;
        this.main.rotateAngleY = (float)Math.toRadians(245);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 1.03F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetZ = -0.34F;
        this.main.offsetY = -0.18F;
        this.main.offsetX = -0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.14F;
        this.main.offsetZ = 0.015F;
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
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(frontleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(frontrightfin, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(backleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(backrightfin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(backrightfin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(main, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetX = -0.7F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
