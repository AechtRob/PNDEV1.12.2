package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelOphiopsis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer PelvicfinR;
    private final AdvancedModelRenderer PelvicfinL;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer Body6;
    private final AdvancedModelRenderer PectoralfinR;
    private final AdvancedModelRenderer PectoralfinL;
    private final AdvancedModelRenderer jaw;

    public ModelOphiopsis() {
        this.textureWidth = 50;
        this.textureHeight = 50;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 27.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 32, 23, -1.5F, -6.9F, -11.0F, 3, 1, 2, 0.02F, false));
        this.Body.cubeList.add(new ModelBox(Body, 26, 14, -2.0F, -8.25F, -8.0F, 4, 5, 3, 0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 31, 33, -1.5F, -5.25F, -9.75F, 3, 2, 2, -0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -5.75F, -12.75F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5934F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 33, -2.0F, -0.05F, 0.45F, 3, 2, 2, -0.005F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, -0.05F, -0.05F, 3, 1, 1, -0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 14, -2.0F, 1.45F, 1.2F, 3, 1, 1, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -8.25F, -8.0F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3796F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 33, -2.0F, 0.0F, -3.0F, 3, 3, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -4.25F, -8.0F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 1.7F, 0.25F, -4.75F, 0, 1, 3, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 2, 0.65F, 0.25F, -4.95F, 1, 1, 0, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.7F, 0.25F, -4.75F, 0, 1, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 2, -0.65F, 0.25F, -4.95F, 1, 1, 0, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 25, -1.0F, -0.25F, -5.0F, 3, 1, 5, 0.01F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -5.5F, -5.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -2.0F, -2.75F, -0.5F, 4, 5, 8, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -0.25F, 7.5F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 13, -1.5F, -1.5F, -1.0F, 3, 3, 8, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 0, 0.0F, -4.5F, 4.5F, 0, 3, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.5F, 6.975F);
        this.Body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1134F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 5, -1.0F, -1.0F, -7.975F, 2, 1, 8, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.5F, 6.975F);
        this.Body3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1134F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 16, -1.0F, 0.0F, -7.975F, 2, 1, 8, -0.01F, false));

        this.PelvicfinR = new AdvancedModelRenderer(this);
        this.PelvicfinR.setRotationPoint(-0.75F, 2.0F, 2.5F);
        this.Body3.addChild(PelvicfinR);
        this.setRotateAngle(PelvicfinR, 0.0873F, 0.0F, 0.5236F);
        this.PelvicfinR.cubeList.add(new ModelBox(PelvicfinR, 0, 12, 0.0F, -0.25F, 0.0F, 0, 2, 3, 0.0F, false));

        this.PelvicfinL = new AdvancedModelRenderer(this);
        this.PelvicfinL.setRotationPoint(0.75F, 2.0F, 2.5F);
        this.Body3.addChild(PelvicfinL);
        this.setRotateAngle(PelvicfinL, 0.0873F, 0.0F, -0.5236F);
        this.PelvicfinL.cubeList.add(new ModelBox(PelvicfinL, 0, 12, 0.0F, -0.25F, 0.0F, 0, 2, 3, 0.0F, true));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 6.975F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 25, 26, -1.0F, -1.0F, -0.5F, 2, 2, 5, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 10, 0.0F, 1.0F, 0.525F, 0, 2, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, 4.5F);
        this.Body4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.096F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 0, -0.5F, -1.0F, -5.0F, 1, 1, 5, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.0F, 4.5F);
        this.Body4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1047F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 6, -0.5F, 0.0F, -5.0F, 1, 1, 5, -0.01F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 6, 25, -0.5F, -1.0F, -0.1F, 1, 2, 6, -0.01F, false));

        this.Body6 = new AdvancedModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 0, 18, 0.0F, -3.5F, -0.1F, 0, 7, 6, 0.0F, false));

        this.PectoralfinR = new AdvancedModelRenderer(this);
        this.PectoralfinR.setRotationPoint(-2.0F, -4.25F, -5.0F);
        this.Body.addChild(PectoralfinR);
        this.setRotateAngle(PectoralfinR, -0.7854F, -0.4363F, 0.4363F);
        this.PectoralfinR.cubeList.add(new ModelBox(PectoralfinR, 0, 27, 0.0F, -2.0F, 0.0F, 0, 3, 6, 0.0F, false));

        this.PectoralfinL = new AdvancedModelRenderer(this);
        this.PectoralfinL.setRotationPoint(2.0F, -4.25F, -5.0F);
        this.Body.addChild(PectoralfinL);
        this.setRotateAngle(PectoralfinL, -0.7854F, 0.4363F, -0.4363F);
        this.PectoralfinL.cubeList.add(new ModelBox(PectoralfinL, 0, 27, 0.0F, -2.0F, 0.0F, 0, 3, 6, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -3.85F, -9.5F);
        this.Body.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 16, 0, -1.0F, -0.5F, -3.55F, 2, 1, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 3, -0.85F, -1.0F, -3.3F, 0, 1, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 3, 0.85F, -1.0F, -3.3F, 0, 1, 4, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Body.offsetY = -1.2F;
        this.Body.offsetX = 0.4F;
        this.Body.offsetZ = 2.0F;
        this.Body.rotateAngleY = (float)Math.toRadians(120);
        this.Body.rotateAngleX = (float)Math.toRadians(1);
        this.Body.rotateAngleZ = (float)Math.toRadians(0);
        this.Body.scaleChildren = true;
        float scaler = 2.2F;
        this.Body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Body2, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Body6, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r1, 0.5934F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.3796F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralfinL, -0.7854F, 0.4363F, -0.4363F);
        this.setRotateAngle(PectoralfinR, -0.7854F, -0.4363F, 0.4363F);
        this.setRotateAngle(PelvicfinL, 0.0873F, 0.0F, -0.5236F);
        this.setRotateAngle(PelvicfinR, 0.0873F, 0.0F, 0.5236F);
        //End of pose, now render the model:
        this.Body.render(f);
        //Reset rotations, positions and sizing:
        this.Body.setScale(1.0F, 1.0F, 1.0F);
        this.Body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.Body.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 1.0036F, 0.0F, 0.0F);
        //this.body.offsetX = -0.09F;
        this.Body.offsetY = -0.21F;
        this.Body.offsetX = -0.06F;
        this.Body.offsetZ = -0.01F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body2, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Body6, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r1, 0.5934F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.3796F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralfinL, -0.7854F, 0.4363F, -0.4363F);
        this.setRotateAngle(PectoralfinR, -0.7854F, -0.4363F, 0.4363F);
        this.setRotateAngle(PelvicfinL, 0.0873F, 0.0F, -0.5236F);
        this.setRotateAngle(PelvicfinR, 0.0873F, 0.0F, 0.5236F);
        this.Body.offsetY = -0.55F;
        this.Body.render(0.01F);
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
        //this.Body.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body3, this.Body4, this.Body5, this.Body6};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.2F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(PectoralfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PectoralfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PelvicfinL, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(PelvicfinL, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.walk(PelvicfinR, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(PelvicfinR, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);


            this.swing(Body, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                 this.chainSwing(fishTail, speed*0.8F, 0.05F, 0, f2, 0);
                 this.Body.rotateAngleZ = (float) Math.toRadians(90);
                this.Body.offsetY = -0.3F;
                this.bob(Body, speed*0.8F, 4F, false, f2, 1);
            }
        }
    }
}
