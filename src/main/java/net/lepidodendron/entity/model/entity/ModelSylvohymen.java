package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSylvohymen extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer mouth;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer forewingR;
    private final AdvancedModelRenderer hindwingR;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cerciR;
    private final AdvancedModelRenderer cerciL;
    private final AdvancedModelRenderer hindwingL;
    private final AdvancedModelRenderer forewingL;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL;

    public ModelSylvohymen() {
        this.textureWidth = 20;
        this.textureHeight = 15;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(1.0F, 22.5F, -1.2F);
        this.body.cubeList.add(new ModelBox(body, 0, 2, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 8, -1.5F, -1.25F, 0.0F, 1, 1, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-1.0F, -0.5F, 0.0F);
        this.body.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 9, 2, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.5F, -0.5F, -1.0F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.1309F, 0.2618F, -0.1309F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 13, 1, 0.101F, -1.5F, -1.8F, 0, 2, 2, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.5F, -0.5F, -1.0F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.1309F, -0.2618F, 0.1309F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 13, 1, -0.101F, -1.5F, -1.8F, 0, 2, 2, 0.0F, true));

        this.mouth = new AdvancedModelRenderer(this);
        this.mouth.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.head.addChild(mouth);
        this.setRotateAngle(mouth, 0.2618F, 0.0F, 0.0F);
        this.mouth.cubeList.add(new ModelBox(mouth, 6, 0, 0.0F, -0.483F, -1.8706F, 0, 1, 2, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-2.0F, 0.0F, 1.0F);
        this.body.addChild(legR2);
        this.legR2.cubeList.add(new ModelBox(legR2, 5, 8, -2.0F, -0.5F, 0.0F, 2, 2, 0, 0.0F, false));

        this.forewingR = new AdvancedModelRenderer(this);
        this.forewingR.setRotationPoint(-1.029F, -1.151F, 1.0802F);
        this.body.addChild(forewingR);
        this.setRotateAngle(forewingR, 0.0F, -0.3491F, 0.0F);
        this.forewingR.cubeList.add(new ModelBox(forewingR, 0, 0, -8.0F, 0.001F, -0.5F, 8, 0, 2, 0.0F, false));

        this.hindwingR = new AdvancedModelRenderer(this);
        this.hindwingR.setRotationPoint(-1.4055F, -1.051F, 1.5199F);
        this.body.addChild(hindwingR);
        this.setRotateAngle(hindwingR, 0.0F, 0.0873F, 0.0F);
        this.hindwingR.cubeList.add(new ModelBox(hindwingR, 0, 0, -8.0F, 0.001F, -0.5F, 8, 0, 2, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, -0.5236F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 5, 8, -2.0F, -0.5F, 0.0F, 2, 2, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-2.0F, 0.0F, 2.0F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.6981F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 5, 8, -2.0F, -0.5F, 0.0F, 2, 2, 0, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(-1.0F, -0.5F, 2.0F);
        this.body.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 7, 4, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.abdomen.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1309F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 7, -0.1086F, -0.5F, -0.1305F, 1, 1, 3, -0.001F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.abdomen.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.1309F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 7, -0.8914F, -0.5F, -0.1305F, 1, 1, 3, -0.001F, false));

        this.cerciR = new AdvancedModelRenderer(this);
        this.cerciR.setRotationPoint(-0.2F, 0.0F, 3.0F);
        this.abdomen.addChild(cerciR);
        this.setRotateAngle(cerciR, 0.0F, -0.3927F, 0.0873F);
        this.cerciR.cubeList.add(new ModelBox(cerciR, 0, 0, 0.0F, -1.5F, 0.0F, 0, 2, 5, 0.0F, false));

        this.cerciL = new AdvancedModelRenderer(this);
        this.cerciL.setRotationPoint(0.2F, 0.0F, 3.0F);
        this.abdomen.addChild(cerciL);
        this.setRotateAngle(cerciL, 0.0F, 0.3927F, -0.0873F);
        this.cerciL.cubeList.add(new ModelBox(cerciL, 0, 0, 0.0F, -1.5F, 0.0F, 0, 2, 5, 0.0F, true));

        this.hindwingL = new AdvancedModelRenderer(this);
        this.hindwingL.setRotationPoint(-0.5945F, -1.051F, 1.5199F);
        this.body.addChild(hindwingL);
        this.setRotateAngle(hindwingL, 0.0F, -0.0873F, 0.0F);
        this.hindwingL.cubeList.add(new ModelBox(hindwingL, 0, 0, 0.0F, 0.001F, -0.5F, 8, 0, 2, 0.0F, true));

        this.forewingL = new AdvancedModelRenderer(this);
        this.forewingL.setRotationPoint(-0.971F, -1.151F, 1.0802F);
        this.body.addChild(forewingL);
        this.setRotateAngle(forewingL, 0.0F, 0.3491F, 0.0F);
        this.forewingL.cubeList.add(new ModelBox(forewingL, 0, 0, 0.0F, 0.001F, -0.5F, 8, 0, 2, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.6981F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 5, 8, 0.0F, -0.5F, 0.0F, 2, 2, 0, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body.addChild(legL2);
        this.legL2.cubeList.add(new ModelBox(legL2, 5, 8, 0.0F, -0.5F, 0.0F, 2, 2, 0, 0.0F, true));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.5236F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 5, 8, 0.0F, -0.5F, 0.0F, 2, 2, 0, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.offsetZ = -0.07F;
        this.body.render(0.015F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {

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
        //this.body.offsetY = 10.05F;

        EntityPrehistoricFloraInsectFlyingBase ee = (EntityPrehistoricFloraInsectFlyingBase) e;
        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) {
            this.setRotateAngle(legR3, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(legR2, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(legL3, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(legL2, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(legR, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(legL, 0.0F, 0.0F, 0.7854F);
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

            this.flap(legL,0.5F * modifier, 0.2F, false, 0,0.2F, f2, 1F);
            this.flap(legR,0.5F * modifier, -0.2F, false, 0,-0.2F, f2, 1F);
            this.flap(legL2,0.5F * modifier, 0.2F, false, 1,0.2F, f2, 1F);
            this.flap(legR2,0.5F * modifier, -0.2F, false, 1,-0.2F, f2, 1F);
            this.flap(legL3,0.5F * modifier, 0.2F, false, 2,0.2F, f2, 1F);
            this.flap(legR3,0.5F * modifier, -0.2F, false, 2,-0.2F, f2, 1F);

        }

        this.walk(antennaL, 0.3F, -0.85F, false,0,0.1F, f2, 1F);
        this.walk(antennaR, 0.3F, 0.85F, false,0,0.1F, f2, 1F);
        this.swing(antennaL, 0.3F, -0.25F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.3F, 0.25F, false, 0, 0.1F, f2, 0.8F);

        this.swing(cerciL, 1.3F, -0.15F, false, 0, -0.08F, f2, 0.8F);
        this.swing(cerciR, 1.3F, 0.15F, false, 0, 0.08F, f2, 0.8F);

    }
}
