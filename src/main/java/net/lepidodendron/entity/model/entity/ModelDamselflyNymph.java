package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelDamselflyNymph extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tailL;
    private final AdvancedModelRenderer tailR;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR;

    public ModelDamselflyNymph() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.0F, -1.0F);
        this.body.cubeList.add(new ModelBox(body, 8, 0, -1.5F, -1.0F, -4.0F, 3, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 7, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.5F, -0.5F, -4.0F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.3491F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 3, 0.0F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.5F, -0.5F, -4.0F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.3491F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 3, 0.0F, -0.5F, -1.0F, 0, 1, 1, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.body.addChild(body1);
        this.setRotateAngle(body1, -0.0873F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body1.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.tailL = new AdvancedModelRenderer(this);
        this.tailL.setRotationPoint(0.25F, 0.0F, 6.0F);
        this.body1.addChild(tailL);
        this.setRotateAngle(tailL, 0.0F, 0.3491F, 0.0F);
        this.tailL.cubeList.add(new ModelBox(tailL, 0, 0, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.tailR = new AdvancedModelRenderer(this);
        this.tailR.setRotationPoint(-0.25F, 0.0F, 6.0F);
        this.body1.addChild(tailR);
        this.setRotateAngle(tailR, 0.0F, -0.3491F, 0.0F);
        this.tailR.cubeList.add(new ModelBox(tailR, 0, 0, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, -0.5F, -2.0F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, -0.4363F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 7, 7, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, -0.5F, -2.0F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.4363F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 7, 7, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, -0.5F, -1.0F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.6981F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 7, 7, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, -0.5F, -1.0F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.6981F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 7, 7, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.0F, -0.5F, -3.0F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, -0.2182F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 0, 0.0F, -0.5F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.0F, -0.5F, -3.0F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.2182F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 0, -3.0F, -0.5F, 0.0F, 3, 3, 0, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        this.body.render(f5 * 0.295F);

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
        this.body.offsetY = 0.95F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] body2 = {this.body1, this.tail};
        AdvancedModelRenderer[] TailL = {this.tailL};
        AdvancedModelRenderer[] TailR = {this.tailR};

        float speed = 0.4F;
        float tailVdegree = 1.0F;
        float tailHdegree = 0.0F;
        float tailSwing = 1.0F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.2F;
            tailVdegree = 0.06F;
            tailHdegree = 0.2F;
            tailSwing = 0.4F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(body2, speed, tailVdegree * 0.3f, -3, f2, 1);
            this.chainSwing(TailL, speed * 2, tailVdegree * 0.3f, -3, f2, 1);
            this.chainSwing(TailR, speed * 2, tailVdegree * 0.3f, -3, f2, 1);
            this.chainSwing(body2, speed, tailHdegree, -2.5, f2, tailSwing);
            this.swing(legL, 0.7F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.swing(legR, 0.7F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.swing(legL2, 0.7F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.swing(legR2, 0.7F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.swing(legL3, 0.7F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.swing(legR3, 0.7F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);

            this.swing(antennaL, 1.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.swing(antennaR, 1.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);

            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!isAtBottom) {
                this.bob(body, -speed, 0.7F, false, f2, 2);
                 }
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 1.0F;
                this.bob(body, -speed, 1F, false, f2, 1);
                this.chainWave(body2, speed, tailHdegree, -3, f2, 1);
                this.chainSwing(body2, speed, tailVdegree, -3, f2, 1);
            }
        }
    }
}
