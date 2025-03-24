package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraCheirurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelCheirurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer segment;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer segment2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer segment3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer segment4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR;

    public ModelCheirurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 25, -0.99F, -1.5F, -7.99F, 2, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 3, 1.0F, -1.0F, -7.0F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -1.0F, -7.0F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 8, -7.0F, -0.5F, -6.0F, 4, 0, 8, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 10, 25, -1.0F, -1.0F, -8.0F, 2, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 8, 8, 3.0F, -0.5F, -6.0F, 4, 0, 8, 0.0F, false));

        this.segment = new AdvancedModelRenderer(this);
        this.segment.setRotationPoint(0.0F, -0.5F, -5.0F);
        this.head.addChild(segment);
        this.segment.cubeList.add(new ModelBox(segment, 4, 22, -2.0F, -0.5F, 0.0F, 4, 1, 2, 0.0F, false));
        this.segment.cubeList.add(new ModelBox(segment, 23, 13, 1.25F, 0.25F, 0.25F, 2, 0, 1, 0.0F, false));
        this.segment.cubeList.add(new ModelBox(segment, 24, 24, -1.0F, -0.75F, 0.0F, 2, 1, 2, 0.0F, false));
        this.segment.cubeList.add(new ModelBox(segment, 23, 13, -3.25F, 0.25F, 0.25F, 2, 0, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.segment.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.1745F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 6, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.segment.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.1745F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 7, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.segment2 = new AdvancedModelRenderer(this);
        this.segment2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment.addChild(segment2);
        this.segment2.cubeList.add(new ModelBox(segment2, 4, 22, -2.0F, -0.5F, 0.0F, 4, 1, 2, 0.0F, false));
        this.segment2.cubeList.add(new ModelBox(segment2, 23, 13, 1.25F, 0.25F, 0.25F, 2, 0, 1, 0.0F, false));
        this.segment2.cubeList.add(new ModelBox(segment2, 24, 24, -1.0F, -0.75F, 0.0F, 2, 1, 2, 0.0F, false));
        this.segment2.cubeList.add(new ModelBox(segment2, 23, 13, -3.25F, 0.25F, 0.25F, 2, 0, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.segment2.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.1745F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 6, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.segment2.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, -0.1745F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 7, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.segment3 = new AdvancedModelRenderer(this);
        this.segment3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment2.addChild(segment3);
        this.segment3.cubeList.add(new ModelBox(segment3, 4, 22, -2.0F, -0.5F, 0.0F, 4, 1, 2, 0.0F, false));
        this.segment3.cubeList.add(new ModelBox(segment3, 23, 13, 1.25F, 0.25F, 0.25F, 2, 0, 1, 0.0F, false));
        this.segment3.cubeList.add(new ModelBox(segment3, 24, 24, -1.0F, -0.75F, 0.0F, 2, 1, 2, 0.0F, false));
        this.segment3.cubeList.add(new ModelBox(segment3, 23, 13, -3.25F, 0.25F, 0.25F, 2, 0, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.segment3.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.1745F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 6, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.segment3.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, -0.1745F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 7, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.segment4 = new AdvancedModelRenderer(this);
        this.segment4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment3.addChild(segment4);
        this.segment4.cubeList.add(new ModelBox(segment4, 4, 22, -2.0F, -0.5F, 0.0F, 4, 1, 2, 0.0F, false));
        this.segment4.cubeList.add(new ModelBox(segment4, 23, 13, 1.25F, 0.25F, 0.25F, 2, 0, 1, 0.0F, false));
        this.segment4.cubeList.add(new ModelBox(segment4, 24, 24, -1.0F, -0.75F, 0.0F, 2, 1, 2, 0.0F, false));
        this.segment4.cubeList.add(new ModelBox(segment4, 23, 13, -3.25F, 0.25F, 0.25F, 2, 0, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.segment4.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, 0.1745F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 6, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.segment4.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, -0.1745F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 7, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment4.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 8, -1.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 10, -0.5F, -0.5F, 1.0F, 1, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -3.0F, 0.25F, 0.5F, 6, 0, 8, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-1.0F, -0.5F, -7.0F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.3491F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 8, 16, -6.0F, 0.0F, -6.0F, 6, 0, 6, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(1.0F, -0.5F, -7.0F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.3491F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 14, 0, 0.0F, 0.0F, -6.0F, 6, 0, 6, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.5F, 0.0F, -5.75F);
        this.head.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0F, 0.1745F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 6, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.5F, 0.0F, -5.75F);
        this.head.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.0F, -0.1745F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 7, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.38F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.0F;
        this.body.offsetX = -0.2F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 1.6F;
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
        this.body.offsetY = 0.91F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5};
        AdvancedModelRenderer[] bodyF = {this.segment,this.segment2,this.segment3,this.segment4};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraCheirurus) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(legL, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(legR, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(legR2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(legR3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(legL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(legR4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(legL5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
                this.flap(legR5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
                this.chainSwing(bodyF, 0.1F, 0.1F, -3, f2, 1.0F);
                this.chainWave(bodyF, 0.1F, 0.0f, -3, f2, 0F);
            }
            this.bob(body, 0.0F, 0.0F, false, f2, 1);
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(legL, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.2F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.2F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.2F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.2F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.chainSwing(bodyF, 0.2F, 0.05F, -3, f2, 0.5F);
            this.chainWave(bodyF, 0.5F, 0.07f, -3, f2, 0.8F);
            this.bob(body, 0.2F, 0.2F, false, f2, 1);
        }

        this.swing(antennaL, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);

    }
}
