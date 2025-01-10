package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHaplolepis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer dorsalfinright;
    private final AdvancedModelRenderer dorsalfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;

    public ModelHaplolepis() {
        this.textureWidth = 25;
        this.textureHeight = 25;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 21.0F, 3.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -2.0F, -7.0F, 3, 3, 4, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 13, 13, -1.5F, -1.0F, -7.8F, 3, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 6, -1.0F, -0.5F, -8.65F, 2, 1, 1, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 11, -1.35F, -0.5F, -8.775F, 1, 1, 1, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 11, 0.35F, -0.5F, -8.775F, 1, 1, 1, -0.01F, true));
        this.body.cubeList.add(new ModelBox(body, 10, 17, -0.5F, -0.5F, -10.6F, 1, 1, 2, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5F, -10.6F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 4, 18, -1.0F, 0.0F, 1.0F, 2, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 0, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 16, -1.0F, -3.45F, -8.4F, 2, 2, 1, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.0F, -10.6F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 15, -0.975F, -0.75F, 0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.0F, -10.6F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.4363F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 15, -0.025F, -0.75F, 0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0F, -10.6F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.4189F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 0, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 0.0F, -10.6F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.4189F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 0, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 4, -1.5F, 0.0F, -1.0F, 3, 1, 1, -0.01F, false));

        this.dorsalfinright = new AdvancedModelRenderer(this);
        this.dorsalfinright.setRotationPoint(-1.5F, 1.0F, -6.25F);
        this.body.addChild(dorsalfinright);
        this.setRotateAngle(dorsalfinright, 0.0F, 0.9599F, -0.7854F);
        this.dorsalfinright.cubeList.add(new ModelBox(dorsalfinright, 17, 3, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.dorsalfinleft = new AdvancedModelRenderer(this);
        this.dorsalfinleft.setRotationPoint(1.5F, 1.0F, -6.25F);
        this.body.addChild(dorsalfinleft);
        this.setRotateAngle(dorsalfinleft, 0.0F, -0.9599F, 0.7854F);
        this.dorsalfinleft.cubeList.add(new ModelBox(dorsalfinleft, 17, 3, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.body.addChild(body2);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 13, -1.0F, -1.875F, -1.0F, 2, 1, 4, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 7, -1.0F, -1.15F, -0.9F, 2, 2, 4, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 1.35F, 0.0F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0F, 0.9599F, -0.7854F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 3, 10, -1.75F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 1.35F, 0.0F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0F, -0.9599F, 0.7854F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 3, 10, -0.25F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 3.1F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -0.5F, -0.95F, -0.75F, 1, 2, 1, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.5F, -0.1F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 0, -0.5F, -0.375F, -0.25F, 1, 1, 3, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 18, -0.5F, -0.6F, 2.5F, 1, 1, 2, -0.01F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 2, 0.0F, -0.6F, 2.5F, 0, 3, 5, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.5F, -0.1F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 13, -0.5F, -1.5F, -0.25F, 1, 1, 3, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 1.1F, 0.15F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.0908F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 12, 1.0F, -0.725F, -0.25F, 0, 3, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -1.15F, -0.35F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.8727F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 18, 1.0F, -2.475F, 0.0F, 0, 3, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, -7.65F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 10, -0.5F, 0.0F, -2.825F, 1, 1, 2, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 13, -1.325F, 0.0F, -1.025F, 1, 1, 1, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 13, 0.325F, 0.0F, -1.025F, 1, 1, 1, -0.01F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 9, -1.0F, 0.0F, -0.9F, 2, 1, 1, 0.02F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.5F, -2.85F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.4189F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 6, -1.025F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.5F, -2.85F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.4189F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 6, 0.025F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.30F;
        this.body.offsetX = 1.2F;
        this.body.rotateAngleY = (float)Math.toRadians(130);
        this.body.rotateAngleX = (float)Math.toRadians(0);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 2.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.body.offsetY = -0.18F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
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
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(dorsalfinleft, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(dorsalfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(dorsalfinright, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(dorsalfinright, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(pelvicfinleft, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(pelvicfinleft, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(pelvicfinright, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(pelvicfinright, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(body, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                //this.body.offsetY = -0.1F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
