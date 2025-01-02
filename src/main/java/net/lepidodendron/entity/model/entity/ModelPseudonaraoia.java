package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraPseudonaraoia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelPseudonaraoia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer pseudonaraoia;
    private final AdvancedModelRenderer cephalon;
    private final AdvancedModelRenderer anntennae1;
    private final AdvancedModelRenderer anntennae2;
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer pygidium;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightleg4;

    public ModelPseudonaraoia() {
        this.textureWidth = 16;
        this.textureHeight = 15;

        this.pseudonaraoia = new AdvancedModelRenderer(this);
        this.pseudonaraoia.setRotationPoint(0.0F, 23.35F, 0.0F);


        this.cephalon = new AdvancedModelRenderer(this);
        this.cephalon.setRotationPoint(0.0F, -0.15F, 0.0F);
        this.pseudonaraoia.addChild(cephalon);
        this.cephalon.cubeList.add(new ModelBox(cephalon, 1, 5, -2.5F, -0.025F, -5.0F, 5, 0, 5, 0.0F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 1, 11, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.anntennae1 = new AdvancedModelRenderer(this);
        this.anntennae1.setRotationPoint(0.3815F, 0.161F, -3.0312F);
        this.cephalon.addChild(anntennae1);
        this.setRotateAngle(anntennae1, -0.088F, -0.1304F, 0.0115F);
        this.anntennae1.cubeList.add(new ModelBox(anntennae1, -3, 5, 0.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

        this.anntennae2 = new AdvancedModelRenderer(this);
        this.anntennae2.setRotationPoint(-0.3815F, 0.161F, -3.0312F);
        this.cephalon.addChild(anntennae2);
        this.setRotateAngle(anntennae2, -0.088F, 0.1304F, -0.0115F);
        this.anntennae2.cubeList.add(new ModelBox(anntennae2, -3, 5, -1.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(0.5398F, 0.3564F, -2.3094F);
        this.cephalon.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.0873F, -1.1781F, 0.0F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, -3, 5, -0.5F, 0.0F, -2.5F, 1, 0, 3, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.5019F, 0.3564F, -1.0F);
        this.cephalon.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.0F, -1.5708F, 0.0873F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, -3, 5, -0.5F, 0.0F, -2.5F, 1, 0, 3, 0.0F, false));

        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(-0.5394F, 0.3651F, -2.3094F);
        this.cephalon.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.0873F, 1.1781F, 0.0F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, -3, 5, -0.5F, 0.0F, -2.5F, 1, 0, 3, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.4868F, 0.3579F, -1.0F);
        this.cephalon.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.0F, 1.5708F, -0.0873F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, -3, 5, -0.5F, 0.0F, -2.5F, 1, 0, 3, 0.0F, false));

        this.pygidium = new AdvancedModelRenderer(this);
        this.pygidium.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cephalon.addChild(pygidium);
        this.pygidium.cubeList.add(new ModelBox(pygidium, 0, 6, -0.5F, -0.5F, 0.0F, 1, 1, 4, -0.001F, false));
        this.pygidium.cubeList.add(new ModelBox(pygidium, -5, 0, -2.5F, 0.0F, 0.0F, 5, 0, 5, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.5076F, 0.2132F, 1.2F);
        this.pygidium.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.0F, 1.5708F, 0.1745F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, -3, 5, -0.5F, 0.0F, -0.5F, 1, 0, 3, 0.0F, false));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.5451F, 0.2132F, 2.7866F);
        this.pygidium.addChild(leftleg4);
        this.setRotateAngle(leftleg4, -0.1745F, 1.1781F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, -3, 5, -0.5246F, -0.0087F, -0.5004F, 1, 0, 3, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-0.5076F, 0.2132F, 1.2F);
        this.pygidium.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.0F, 1.5708F, -0.1745F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, -3, 5, -0.5F, 0.0F, -2.5F, 1, 0, 3, 0.0F, false));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(-0.5451F, 0.1632F, 2.8116F);
        this.pygidium.addChild(rightleg4);
        this.setRotateAngle(rightleg4, -2.9671F, 1.1781F, -3.1416F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, -3, 5, -0.5F, 0.0F, -2.5F, 1, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.pseudonaraoia.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.pseudonaraoia.offsetY = -2.0F;
        this.pseudonaraoia.offsetX = -1.338F;
        this.pseudonaraoia.rotateAngleY = (float)Math.toRadians(200);
        this.pseudonaraoia.rotateAngleX = (float)Math.toRadians(8);
        this.pseudonaraoia.rotateAngleZ = (float)Math.toRadians(-8);
        this.pseudonaraoia.scaleChildren = true;
        float scaler = 1.63F;
        this.pseudonaraoia.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.pseudonaraoia.render(f);
        //Reset rotations, positions and sizing:
        this.pseudonaraoia.setScale(1.0F, 1.0F, 1.0F);
        this.pseudonaraoia.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(pseudonaraoia, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(cephalon, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(pygidium, 0.0F, 0.2F, 0.0F);
        this.pseudonaraoia.offsetY = 0.06F;
        this.pseudonaraoia.offsetZ = 0.016F;
        this.pseudonaraoia.render(0.01F);
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
        //this.pseudonaraoia.offsetY = 1.122F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.leftleg1, this.leftleg2, this.leftleg3, leftleg4};
        AdvancedModelRenderer[] legsR = {this.rightleg1, this.rightleg2, this.rightleg3, rightleg4};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraPseudonaraoia) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(leftleg1, 0.5F, -0.2F, false, 0, -0.5F, f2, 0.3F);
                this.flap(rightleg1, 0.5F, 0.2F, false, 0, 0.5F, f2, 0.3F);
                this.flap(leftleg2, 0.5F, -0.2F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg2, 0.5F, 0.2F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leftleg3, 0.5F, -0.2F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg3, 0.5F, 0.2F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftleg4, 0.5F, -0.2F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg4, 0.5F, 0.2F, false, 3.0F, 0.5F, f2, 0.3F);


            }
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(leftleg1, 0.2F, -0.2F, false, 0, -0.5F, f2, 0.3F);
            this.flap(rightleg1, 0.2F, 0.2F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leftleg2, 0.2F, -0.2F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg2, 0.2F, 0.2F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg3, 0.2F, -0.2F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg3, 0.2F, 0.2F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg4, 0.2F, -0.2F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg4, 0.2F, 0.2F, false, 3.0F, 0.5F, f2, 0.3F);


        }

        this.swing(anntennae1, 0.36F, -0.21F, false, 0, -0.11F, f2, 0.8F);
        this.swing(anntennae2, 0.36F, 0.21F, false, 0, 0.11F, f2, 0.8F);

    }
}