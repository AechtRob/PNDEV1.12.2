package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelArgentinala extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cerci;
    private final AdvancedModelRenderer cerciR;
    private final AdvancedModelRenderer cerciL;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer hindwingR;
    private final AdvancedModelRenderer hindwingL;
    private final AdvancedModelRenderer forewingR;
    private final AdvancedModelRenderer forewingL;
    private final AdvancedModelRenderer forewingR2;
    private final AdvancedModelRenderer forewingL2;

    public ModelArgentinala() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.3051F, 20.939F, -0.2877F);
        this.body.cubeList.add(new ModelBox(body, 0, 16, -0.8051F, -0.039F, -1.9623F, 1, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 12, -1.0551F, 0.061F, -1.9623F, 1, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 12, -0.5551F, 0.061F, -1.9623F, 1, 1, 4, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0551F, 0.561F, -0.4623F);
        this.body.addChild(legR2);
        this.legR2.cubeList.add(new ModelBox(legR2, 14, 17, -4.0F, -0.5F, 0.0F, 4, 3, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.4449F, 0.561F, -0.4623F);
        this.body.addChild(legL2);
        this.legL2.cubeList.add(new ModelBox(legL2, 14, 17, 0.0F, -0.5F, 0.0F, 4, 3, 0, 0.0F, true));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.0551F, 0.561F, -1.9623F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.5236F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 18, 11, -3.0F, -0.5F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(0.4449F, 0.561F, -1.9623F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.5236F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 18, 11, 0.0F, -0.5F, 0.0F, 3, 3, 0, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0551F, 0.561F, 1.0377F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.6981F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 6, 17, -4.0F, -0.5F, 0.0F, 4, 3, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.4449F, 0.561F, 1.0377F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.6981F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 6, 17, 0.0F, -0.5F, 0.0F, 4, 3, 0, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-0.3051F, 0.561F, 2.0377F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 8, -0.5F, -0.5F, -0.05F, 1, 1, 7, -0.001F, false));

        this.cerci = new AdvancedModelRenderer(this);
        this.cerci.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body2.addChild(cerci);
        this.setRotateAngle(cerci, -0.2182F, 0.0F, 0.0F);
        this.cerci.cubeList.add(new ModelBox(cerci, 0, 5, 0.0F, -1.5F, -0.05F, 0, 2, 3, 0.0F, false));

        this.cerciR = new AdvancedModelRenderer(this);
        this.cerciR.setRotationPoint(-0.5F, 0.0F, 7.0F);
        this.body2.addChild(cerciR);
        this.setRotateAngle(cerciR, 0.0F, -0.3927F, 0.0F);
        this.cerciR.cubeList.add(new ModelBox(cerciR, 0, 0, 0.0F, -0.5F, -0.05F, 0, 1, 2, 0.0F, false));

        this.cerciL = new AdvancedModelRenderer(this);
        this.cerciL.setRotationPoint(0.5F, 0.0F, 7.0F);
        this.body2.addChild(cerciL);
        this.setRotateAngle(cerciL, 0.0F, 0.3927F, 0.0F);
        this.cerciL.cubeList.add(new ModelBox(cerciL, 0, 0, 0.0F, -0.5F, -0.05F, 0, 1, 2, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.3051F, 0.561F, -1.5123F);
        this.body.addChild(head);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -0.345F, -1.9183F, 1, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 11, -0.5F, -0.595F, -1.9183F, 1, 1, 2, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.9183F, 0.1851F, -1.0562F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.5708F, -1.4399F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 10, -0.5F, -0.595F, -1.9183F, 1, 1, 2, -0.002F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.45F, -0.4F, -1.6F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, -0.2618F, -0.2182F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 6, 8, -5.0F, 0.0F, -3.0F, 5, 0, 3, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.45F, -0.4F, -1.6F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, -0.2618F, 0.2182F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 6, 8, 0.0F, 0.0F, -3.0F, 5, 0, 3, 0.0F, true));

        this.hindwingR = new AdvancedModelRenderer(this);
        this.hindwingR.setRotationPoint(-0.763F, 0.02F, 0.575F);
        this.body.addChild(hindwingR);
        this.setRotateAngle(hindwingR, 0.0F, 0.2182F, 0.0F);
        this.hindwingR.cubeList.add(new ModelBox(hindwingR, 0, 4, -11.0F, 0.001F, -0.5F, 11, 0, 4, 0.0F, false));

        this.hindwingL = new AdvancedModelRenderer(this);
        this.hindwingL.setRotationPoint(0.1527F, 0.02F, 0.575F);
        this.body.addChild(hindwingL);
        this.setRotateAngle(hindwingL, 0.0F, -0.2182F, 0.0F);
        this.hindwingL.cubeList.add(new ModelBox(hindwingL, 0, 4, 0.0F, 0.001F, -0.5F, 11, 0, 4, 0.0F, true));

        this.forewingR = new AdvancedModelRenderer(this);
        this.forewingR.setRotationPoint(-0.6103F, 0.0F, -1.0F);
        this.body.addChild(forewingR);
        this.setRotateAngle(forewingR, 0.0F, -0.1309F, 0.0F);
        this.forewingR.cubeList.add(new ModelBox(forewingR, 0, 0, -12.0F, 0.001F, -0.5F, 12, 0, 4, 0.0F, false));

        this.forewingL = new AdvancedModelRenderer(this);
        this.forewingL.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.body.addChild(forewingL);
        this.setRotateAngle(forewingL, 0.0F, 0.1309F, 0.0F);
        this.forewingL.cubeList.add(new ModelBox(forewingL, 0, 0, 0.0F, 0.001F, -0.5F, 12, 0, 4, 0.0F, true));

        this.forewingR2 = new AdvancedModelRenderer(this);
        this.forewingR2.setRotationPoint(-0.6103F, 0.0F, -1.7F);
        this.body.addChild(forewingR2);
        this.setRotateAngle(forewingR2, 0.0F, -0.5236F, 0.0F);
        this.forewingR2.cubeList.add(new ModelBox(forewingR2, 0, 3, -1.0F, -0.009F, -0.5F, 1, 0, 1, 0.0F, false));

        this.forewingL2 = new AdvancedModelRenderer(this);
        this.forewingL2.setRotationPoint(0.0F, 0.0F, -1.7F);
        this.body.addChild(forewingL2);
        this.setRotateAngle(forewingL2, 0.0F, 0.5236F, 0.0F);
        this.forewingL2.cubeList.add(new ModelBox(forewingL2, 0, 3, 0.0F, -0.009F, -0.5F, 1, 0, 1, 0.0F, true));

        updateDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleX = (float)Math.toRadians(90);
        this.body.offsetY = -0.15F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        //this.body.offsetZ = -0.080F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.6F;
        this.body.offsetX = 0.15F;
        this.body.rotateAngleY = (float)Math.toRadians(-10);
        this.body.rotateAngleX = (float)Math.toRadians(60);
        this.body.rotateAngleZ = (float)Math.toRadians(-50);
        float scaler = 4.2F;
        this.body.scaleChildren = true;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.body.offsetY = 1.05F;

        EntityPrehistoricFloraInsectFlyingBase ee = (EntityPrehistoricFloraInsectFlyingBase) e;
        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) {
            this.setRotateAngle(legR3, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(legR2, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(legL3, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(legL2, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(legR1, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(legL1, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(hindwingR, 0.0F, 0.3491F, 0.0F);
            this.setRotateAngle(forewingR, 0.0F, -0.3491F, 0.0F);
            this.setRotateAngle(forewingL, 0.0F, 0.3491F, 0.0F);
            this.setRotateAngle(hindwingL, 0.0F, -0.3491F, 0.0F);
            this.setRotateAngle(antennaL, -0.2618F, -0.2618F, 0.0F);
            this.setRotateAngle(antennaR, -0.2618F, 0.2618F, 0.0F);

            float modifier = 1F;

            this.flap(forewingL,2.2F * modifier, 0.5F, true, 0,0, f2, 1F);
            this.flap(hindwingL,2.2F * modifier, 0.5F, true, 3,0, f2, 1F);

            this.flap(forewingR,2.2F * modifier, 0.5F, false, 0,0, f2, 1F);
            this.flap(hindwingR,2.2F * modifier, 0.5F, false, 3,0F, f2, 1F);

            this.flap(legL1,0.5F * modifier, 0.2F, false, 0,0.2F, f2, 1F);
            this.flap(legR1,0.5F * modifier, -0.2F, false, 0,-0.2F, f2, 1F);
            this.flap(legL2,0.5F * modifier, 0.2F, false, 1,0.2F, f2, 1F);
            this.flap(legR2,0.5F * modifier, -0.2F, false, 1,-0.2F, f2, 1F);
            this.flap(legL3,0.5F * modifier, 0.2F, false, 2,0.2F, f2, 1F);
            this.flap(legR3,0.5F * modifier, -0.2F, false, 2,-0.2F, f2, 1F);

        }

        this.walk(antennaL, 0.3F, -0.15F, false,0,0.1F, f2, 1F);
        this.walk(antennaR, 0.3F, 0.15F, false,0,0.1F, f2, 1F);
        this.swing(antennaL, 0.3F, -0.25F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.3F, 0.25F, false, 0, 0.1F, f2, 0.8F);

        this.swing(cerciL, 0.3F, -0.15F, false, 0, -0.08F, f2, 0.8F);
        this.swing(cerciR, 0.3F, 0.15F, false, 0, 0.08F, f2, 0.8F);


    }
}
