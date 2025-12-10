package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelProscinetes extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Proscinetes;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer PectoralL2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer PelvicL;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer PelvicL2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Body5;

    public ModelProscinetes() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.Proscinetes = new AdvancedModelRenderer(this);
        this.Proscinetes.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -14.5F, -0.4F);
        this.Proscinetes.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 44, 10, -2.0F, -4.0F, -5.0F, 4, 9, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 40, 23, -2.5F, -5.0F, -3.0F, 5, 11, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.0F, -5.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.829F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 66, 66, -1.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 3.2F, -5.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5236F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 64, -1.5F, -2.0F, -1.1F, 3, 1, 3, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 48, -1.5F, -1.0F, -2.5F, 3, 1, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.8F, -5.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 31, 69, -1.0F, 3.8F, -2.0F, 2, 2, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 63, 0, -1.0F, 0.2F, -2.0F, 2, 4, 3, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 4.7F, -5.5F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.637F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 57, 23, -1.0F, -2.0156F, -0.4171F, 2, 2, 6, -0.002F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -4.0F, -5.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.9163F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 43, -1.5F, 0.0F, 0.0F, 3, 4, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.6F, -9.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3229F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 66, 61, -2.0F, -1.5007F, 3.4185F, 4, 2, 2, 0.03F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 57, 50, -2.0F, -1.0007F, 3.9185F, 4, 1, 1, 0.04F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 3.2F, -5.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.5236F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 9, 69, -1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 21, 0, -3.0F, -9.0F, -1.0F, 6, 17, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -9.0F, -1.0F);
        this.Body1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4538F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 53, -2.0F, 0.0F, -0.4F, 4, 3, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 8.0F, -1.0F);
        this.Body1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4363F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 53, 53, -2.0F, -2.0F, 0.0F, 4, 2, 5, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(3.0F, 3.3F, 0.0F);
        this.Body1.addChild(PectoralL);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralL.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.6109F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 64, 0.0F, -2.0F, 0.0F, 0, 4, 4, 0.0F, false));

        this.PectoralL2 = new AdvancedModelRenderer(this);
        this.PectoralL2.setRotationPoint(-3.0F, 3.3F, 0.0F);
        this.Body1.addChild(PectoralL2);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralL2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.6109F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 64, 0.0F, -2.0F, 0.0F, 0, 4, 4, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -2.5F, -11.0F, -1.0F, 5, 21, 5, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -7.0F, 8.0F);
        this.Body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 27, 0.0F, -5.0F, -6.6F, 0, 6, 1, 0.0F, false));

        this.PelvicL = new AdvancedModelRenderer(this);
        this.PelvicL.setRotationPoint(2.6F, 9.0F, 0.7F);
        this.Body2.addChild(PelvicL);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PelvicL.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5307F, 0.422F, 0.2359F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 35, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.PelvicL2 = new AdvancedModelRenderer(this);
        this.PelvicL2.setRotationPoint(-2.6F, 9.0F, 0.7F);
        this.Body2.addChild(PelvicL2);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PelvicL2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.5307F, -0.422F, -0.2359F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 35, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 21, 23, -2.0F, -7.0F, -1.0F, 4, 14, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -7.0F, 4.0F);
        this.Body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 59, 10, 0.0F, -4.0F, -5.6F, 0, 4, 6, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 44, 0, -1.5F, 0.0F, -5.6F, 3, 3, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 7.0F, 4.0F);
        this.Body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.8552F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 64, 0.0F, -1.0F, -4.0F, 0, 5, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 7.0F, 4.0F);
        this.Body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.637F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 57, 32, -1.5F, -3.0F, -5.0F, 3, 3, 5, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 57, 41, -1.5F, -2.0F, -1.0F, 3, 4, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -2.0F, 3.0F);
        this.Body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -1.0559F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 54, -1.0F, 0.0F, -5.4F, 2, 3, 6, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 2.0F, 3.0F);
        this.Body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.0297F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 17, 54, -1.0F, -3.0F, -6.0F, 2, 3, 6, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.8552F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 40, 38, 0.0F, -3.0F, 0.0F, 0, 6, 8, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.7854F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 53, 61, 0.0F, -2.0F, 0.4F, 0, 4, 6, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 34, 62, -1.0F, -2.0F, -1.0F, 2, 2, 4, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 27, -0.001F, -8.0F, 1.0F, 0, 13, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Proscinetes.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Proscinetes.offsetY = -0.2F;
        this.Proscinetes.offsetX = 1.2F;
        this.Proscinetes.rotateAngleY = (float)Math.toRadians(242);
        this.Proscinetes.rotateAngleX = (float)Math.toRadians(8);
        this.Proscinetes.rotateAngleZ = (float)Math.toRadians(-8);
        this.Proscinetes.scaleChildren = true;
        float scaler = 3.63F;
        this.Proscinetes.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Proscinetes.render(f);
        //Reset rotations, positions and sizing:
        this.Proscinetes.setScale(1.0F, 1.0F, 1.0F);
        this.Proscinetes.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
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
        AdvancedModelRenderer[] fishTail = {this.Body3, this.Body4, this.Body5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(PectoralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(PectoralL2, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(PectoralL2, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(PelvicL, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(PelvicL, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(PelvicL2, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(PelvicL2, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(Proscinetes, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Proscinetes.rotateAngleZ = (float) Math.toRadians(90);
                this.Proscinetes.offsetX = -0.8F;
                this.bob(Proscinetes, -speed, 5F, false, f2, 1);
            }
        }
    }
}
