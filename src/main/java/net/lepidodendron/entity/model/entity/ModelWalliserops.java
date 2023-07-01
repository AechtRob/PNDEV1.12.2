package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWalliserops extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer folk;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL5;

    public ModelWalliserops() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 14, 14, -0.49F, -1.5F, -5.0F, 1, 1, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 13, 17, -1.0F, -1.0F, 1.0F, 2, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 8, -2.0F, -1.0F, -5.0F, 4, 1, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -0.25F, -4.75F, 5, 0, 8, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5F, -5.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 18, -2.0F, -0.5F, -3.0F, 4, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 4, -0.5F, -1.25F, -2.75F, 1, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 15, -2.5F, -0.5F, -2.0F, 5, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 14, 8, -2.0F, -1.0F, -1.5F, 4, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 10, 1.75F, -3.0F, -1.25F, 0, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 6, 0.0F, -3.0F, -0.25F, 0, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 8, -1.75F, -3.0F, -1.25F, 0, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 2, -3.25F, -0.25F, 0.0F, 1, 0, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 2.25F, -0.25F, 0.0F, 1, 0, 2, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.75F, 0.25F, -2.75F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.5236F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 26, -2.5F, 0.0F, -6.0F, 3, 0, 6, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.75F, 0.25F, -2.75F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.5236F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 26, -0.5F, 0.0F, -6.0F, 3, 0, 6, 0.0F, true));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-0.25F, 0.5F, -0.5F);
        this.head.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, 0.0F, -0.1745F);
        this.legR1.cubeList.add(new ModelBox(legR1, 11, 16, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.folk = new AdvancedModelRenderer(this);
        this.folk.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.head.addChild(folk);
        this.folk.cubeList.add(new ModelBox(folk, 10, 10, -2.0F, -0.5F, -6.9F, 4, 0, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.folk.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -0.001F, -4.0F, 1, 0, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.folk.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 3, -0.5F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(0.25F, 0.5F, -0.5F);
        this.head.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.0F, 0.1745F);
        this.legL1.cubeList.add(new ModelBox(legL1, 11, 15, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.25F, 0.0F, -4.0F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.1745F);
        this.legR2.cubeList.add(new ModelBox(legR2, 11, 16, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.25F, 0.0F, -2.5F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, -0.1745F);
        this.legR3.cubeList.add(new ModelBox(legR3, 11, 16, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.25F, 0.0F, -1.0F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, -0.1745F);
        this.legR4.cubeList.add(new ModelBox(legR4, 11, 16, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.25F, 0.0F, 0.5F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, -0.1745F);
        this.legR5.cubeList.add(new ModelBox(legR5, 11, 16, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.25F, 0.0F, -4.0F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.1745F);
        this.legL2.cubeList.add(new ModelBox(legL2, 11, 15, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.25F, 0.0F, -2.5F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.1745F);
        this.legL3.cubeList.add(new ModelBox(legL3, 11, 15, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.25F, 0.0F, -1.0F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.1745F);
        this.legL4.cubeList.add(new ModelBox(legL4, 11, 15, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.25F, 0.0F, 0.5F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, 0.1745F);
        this.legL5.cubeList.add(new ModelBox(legL5, 11, 15, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

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
        this.body.offsetZ = 0.1F;
        this.body.render(0.022f);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        //this.body.offsetY = 0.91F;

        AdvancedModelRenderer[] legsL = {this.legL1, this.legL2, this.legL3, this.legL4, this.legL5};
        AdvancedModelRenderer[] legsR = {this.legR1, this.legR2, this.legR3, this.legR4, this.legR5};

        this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
        this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

        this.swing(antennaL, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        this.flap(legL1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
        this.flap(legR1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
        this.flap(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
        this.flap(legR2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
        this.flap(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
        this.flap(legR3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
        this.flap(legL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
        this.flap(legR4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
        this.flap(legL5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
        this.flap(legR5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);

    }
}
