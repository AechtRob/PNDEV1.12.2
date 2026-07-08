package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelGregoriopycnodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer bodymiddle;
    private final AdvancedModelRenderer bodyend;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tailfin;
    private final AdvancedModelRenderer bodyenddorsalslope;
    private final AdvancedModelRenderer dorsalfinpt3;
    private final AdvancedModelRenderer bodyendbellyslope;
    private final AdvancedModelRenderer analfinpt2;
    private final AdvancedModelRenderer bodymiddledorsalslope1;
    private final AdvancedModelRenderer bodymiddledorsalslope2;
    private final AdvancedModelRenderer dorsalfinpt2;
    private final AdvancedModelRenderer dorsalfinpt1;
    private final AdvancedModelRenderer bodymiddlebellyslope1;
    private final AdvancedModelRenderer bodymiddlebellyslope2;
    private final AdvancedModelRenderer analfinpt1;
    private final AdvancedModelRenderer bodyfrontdorsalslope1;
    private final AdvancedModelRenderer bodyfrontdorsalslope2;
    private final AdvancedModelRenderer bodyfrontbellyslope1;
    private final AdvancedModelRenderer bodyfrontbellyslope2;
    private final AdvancedModelRenderer leftpelvicfin;
    private final AdvancedModelRenderer rightpelvicfin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer headdorsalslope;
    private final AdvancedModelRenderer headunderslope;
    private final AdvancedModelRenderer headfront;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer upperjawslope;
    private final AdvancedModelRenderer leftcheek;
    private final AdvancedModelRenderer rightcheek;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer chin;
    private final AdvancedModelRenderer lowerjawunderside;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer leftpectoralfin;
    private final AdvancedModelRenderer rightpectoralfin;

    public ModelGregoriopycnodus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 12.6F, 1.6F);
        this.root.addChild(bodyfront);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 42, -1.5F, -6.5F, -8.0F, 3, 14, 8, 0.0F, true));

        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(0.0F, 0.1F, -0.7F);
        this.bodyfront.addChild(bodymiddle);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 23, 49, -1.0F, -4.5F, 0.0F, 2, 10, 5, 0.01F, true));

        this.bodyend = new AdvancedModelRenderer(this);
        this.bodyend.setRotationPoint(0.0F, 0.8F, 4.3F);
        this.bodymiddle.addChild(bodyend);
        this.bodyend.cubeList.add(new ModelBox(bodyend, 38, 56, -0.5F, -2.5F, 0.0F, 1, 5, 3, 0.01F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.01F, 0.0F, 2.4F);
        this.bodyend.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 47, 60, -0.49F, -1.0F, 0.0F, 1, 2, 2, 0.0F, true));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, -0.2F, 1.3F);
        this.tail.addChild(tailfin);
        this.setRotateAngle(tailfin, -0.0318F, 0.0F, 0.0F);
        this.tailfin.cubeList.add(new ModelBox(tailfin, 52, 0, 0.0F, -6.0F, 0.0F, 0, 13, 6, 0.0F, true));

        this.bodyenddorsalslope = new AdvancedModelRenderer(this);
        this.bodyenddorsalslope.setRotationPoint(0.01F, -3.5F, -0.5F);
        this.bodyend.addChild(bodyenddorsalslope);
        this.setRotateAngle(bodyenddorsalslope, -0.8915F, 0.0F, 0.0F);
        this.bodyenddorsalslope.cubeList.add(new ModelBox(bodyenddorsalslope, 20, 33, -0.51F, -2.0F, 0.0F, 1, 2, 3, 0.0F, true));

        this.dorsalfinpt3 = new AdvancedModelRenderer(this);
        this.dorsalfinpt3.setRotationPoint(0.0F, -2.0F, -0.1F);
        this.bodyenddorsalslope.addChild(dorsalfinpt3);
        this.setRotateAngle(dorsalfinpt3, -0.1698F, 0.0F, 0.0F);
        this.dorsalfinpt3.cubeList.add(new ModelBox(dorsalfinpt3, 23, 1, 0.0F, -1.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.bodyendbellyslope = new AdvancedModelRenderer(this);
        this.bodyendbellyslope.setRotationPoint(-0.01F, 3.4F, -0.8F);
        this.bodyend.addChild(bodyendbellyslope);
        this.setRotateAngle(bodyendbellyslope, 0.8491F, 0.0F, 0.0F);
        this.bodyendbellyslope.cubeList.add(new ModelBox(bodyendbellyslope, 0, 14, -0.49F, 0.0F, 0.0F, 1, 2, 3, 0.0F, true));

        this.analfinpt2 = new AdvancedModelRenderer(this);
        this.analfinpt2.setRotationPoint(0.0F, 1.5F, 0.1F);
        this.bodyendbellyslope.addChild(analfinpt2);
        this.setRotateAngle(analfinpt2, 0.0424F, 0.0F, 0.0F);
        this.analfinpt2.cubeList.add(new ModelBox(analfinpt2, 30, 8, 0.0F, -1.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.bodymiddledorsalslope1 = new AdvancedModelRenderer(this);
        this.bodymiddledorsalslope1.setRotationPoint(-0.01F, -4.3F, 0.0F);
        this.bodymiddle.addChild(bodymiddledorsalslope1);
        this.setRotateAngle(bodymiddledorsalslope1, -0.0424F, 0.0F, 0.0F);
        this.bodymiddledorsalslope1.cubeList.add(new ModelBox(bodymiddledorsalslope1, 0, 7, -0.99F, -4.0F, 0.0F, 2, 4, 2, -0.01F, true));

        this.bodymiddledorsalslope2 = new AdvancedModelRenderer(this);
        this.bodymiddledorsalslope2.setRotationPoint(-0.01F, -4.0F, 2.0F);
        this.bodymiddledorsalslope1.addChild(bodymiddledorsalslope2);
        this.setRotateAngle(bodymiddledorsalslope2, -0.8702F, 0.0F, 0.0F);
        this.bodymiddledorsalslope2.cubeList.add(new ModelBox(bodymiddledorsalslope2, 14, 22, -0.98F, 0.0F, 0.0F, 2, 3, 6, 0.0F, true));

        this.dorsalfinpt2 = new AdvancedModelRenderer(this);
        this.dorsalfinpt2.setRotationPoint(0.02F, -0.2F, 2.2F);
        this.bodymiddledorsalslope2.addChild(dorsalfinpt2);
        this.setRotateAngle(dorsalfinpt2, -0.0213F, 0.0F, 0.0F);
        this.dorsalfinpt2.cubeList.add(new ModelBox(dorsalfinpt2, 32, 1, 0.0F, -1.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.dorsalfinpt1 = new AdvancedModelRenderer(this);
        this.dorsalfinpt1.setRotationPoint(0.0F, -4.0F, 0.5F);
        this.bodymiddledorsalslope1.addChild(dorsalfinpt1);
        this.setRotateAngle(dorsalfinpt1, -0.5308F, 0.0F, 0.0F);
        this.dorsalfinpt1.cubeList.add(new ModelBox(dorsalfinpt1, 41, 0, 0.0F, -5.0F, 0.0F, 0, 6, 5, 0.0F, true));

        this.bodymiddlebellyslope1 = new AdvancedModelRenderer(this);
        this.bodymiddlebellyslope1.setRotationPoint(0.01F, 4.8F, -0.1F);
        this.bodymiddle.addChild(bodymiddlebellyslope1);
        this.setRotateAngle(bodymiddlebellyslope1, 0.0637F, 0.0F, 0.0F);
        this.bodymiddlebellyslope1.cubeList.add(new ModelBox(bodymiddlebellyslope1, 9, 10, -1.01F, 0.0F, 0.0F, 2, 4, 2, -0.01F, true));

        this.bodymiddlebellyslope2 = new AdvancedModelRenderer(this);
        this.bodymiddlebellyslope2.setRotationPoint(0.01F, 4.0F, 2.0F);
        this.bodymiddlebellyslope1.addChild(bodymiddlebellyslope2);
        this.setRotateAngle(bodymiddlebellyslope2, 0.7641F, 0.0F, 0.0F);
        this.bodymiddlebellyslope2.cubeList.add(new ModelBox(bodymiddlebellyslope2, 26, 27, -1.02F, -3.0F, 0.0F, 2, 3, 5, 0.0F, true));

        this.analfinpt1 = new AdvancedModelRenderer(this);
        this.analfinpt1.setRotationPoint(0.0F, 0.0F, -0.2F);
        this.bodymiddlebellyslope2.addChild(analfinpt1);
        this.setRotateAngle(analfinpt1, 0.1061F, 0.0F, 0.0F);
        this.analfinpt1.cubeList.add(new ModelBox(analfinpt1, 39, 6, 0.0F, -1.0F, 0.0F, 0, 5, 6, 0.0F, true));

        this.bodyfrontdorsalslope1 = new AdvancedModelRenderer(this);
        this.bodyfrontdorsalslope1.setRotationPoint(0.01F, -6.3F, 0.0F);
        this.bodyfront.addChild(bodyfrontdorsalslope1);
        this.setRotateAngle(bodyfrontdorsalslope1, 0.0637F, 0.0F, 0.0F);
        this.bodyfrontdorsalslope1.cubeList.add(new ModelBox(bodyfrontdorsalslope1, 25, 36, -1.51F, -2.0F, -4.0F, 3, 2, 4, 0.01F, true));

        this.bodyfrontdorsalslope2 = new AdvancedModelRenderer(this);
        this.bodyfrontdorsalslope2.setRotationPoint(0.01F, -2.0F, -4.0F);
        this.bodyfrontdorsalslope1.addChild(bodyfrontdorsalslope2);
        this.setRotateAngle(bodyfrontdorsalslope2, 0.3344F, 0.0F, 0.0F);
        this.bodyfrontdorsalslope2.cubeList.add(new ModelBox(bodyfrontdorsalslope2, 26, 20, -1.52F, 0.0F, -4.0F, 3, 2, 4, -0.01F, true));

        this.bodyfrontbellyslope1 = new AdvancedModelRenderer(this);
        this.bodyfrontbellyslope1.setRotationPoint(0.02F, 7.0F, 0.0F);
        this.bodyfront.addChild(bodyfrontbellyslope1);
        this.setRotateAngle(bodyfrontbellyslope1, -0.0424F, 0.0F, 0.0F);
        this.bodyfrontbellyslope1.cubeList.add(new ModelBox(bodyfrontbellyslope1, 15, 15, -1.52F, 0.0F, -4.0F, 3, 2, 4, 0.01F, true));

        this.bodyfrontbellyslope2 = new AdvancedModelRenderer(this);
        this.bodyfrontbellyslope2.setRotationPoint(-0.01F, 2.0F, -4.0F);
        this.bodyfrontbellyslope1.addChild(bodyfrontbellyslope2);
        this.setRotateAngle(bodyfrontbellyslope2, -0.2951F, 0.0F, 0.0F);
        this.bodyfrontbellyslope2.cubeList.add(new ModelBox(bodyfrontbellyslope2, 0, 20, -1.51F, -2.0F, -4.0F, 3, 2, 4, -0.01F, true));

        this.leftpelvicfin = new AdvancedModelRenderer(this);
        this.leftpelvicfin.setRotationPoint(-1.3F, 1.0F, -1.2F);
        this.bodyfrontbellyslope1.addChild(leftpelvicfin);
        this.setRotateAngle(leftpelvicfin, -0.1485F, -0.3396F, 0.0F);
        this.leftpelvicfin.cubeList.add(new ModelBox(leftpelvicfin, 31, 6, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.rightpelvicfin = new AdvancedModelRenderer(this);
        this.rightpelvicfin.setRotationPoint(1.3F, 1.0F, -1.2F);
        this.bodyfrontbellyslope1.addChild(rightpelvicfin);
        this.setRotateAngle(rightpelvicfin, -0.1485F, 0.3396F, 0.0F);
        this.rightpelvicfin.cubeList.add(new ModelBox(rightpelvicfin, 36, 6, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.01F, -1.5F, -7.6F);
        this.bodyfront.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 27, -1.99F, -2.5F, -3.5F, 4, 9, 5, 0.0F, true));

        this.headdorsalslope = new AdvancedModelRenderer(this);
        this.headdorsalslope.setRotationPoint(-0.01F, -2.5F, -3.4F);
        this.head.addChild(headdorsalslope);
        this.setRotateAngle(headdorsalslope, 0.6828F, 0.0F, 0.0F);
        this.headdorsalslope.cubeList.add(new ModelBox(headdorsalslope, 37, 24, -1.48F, 0.0F, 0.0F, 3, 2, 4, 0.01F, true));

        this.headunderslope = new AdvancedModelRenderer(this);
        this.headunderslope.setRotationPoint(-0.02F, 6.5F, -3.4F);
        this.head.addChild(headunderslope);
        this.setRotateAngle(headunderslope, -0.6793F, 0.0F, 0.0F);
        this.headunderslope.cubeList.add(new ModelBox(headunderslope, 37, 32, -1.47F, -2.0F, 0.0F, 3, 2, 4, 0.01F, true));

        this.headfront = new AdvancedModelRenderer(this);
        this.headfront.setRotationPoint(0.0F, -2.5F, -3.5F);
        this.head.addChild(headfront);
        this.setRotateAngle(headfront, -0.4033F, 0.0F, 0.0F);
        this.headfront.cubeList.add(new ModelBox(headfront, 15, 41, -1.49F, 0.0F, 0.0F, 3, 5, 3, 0.0F, true));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(-0.01F, 5.0F, 0.0F);
        this.headfront.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.9976F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 32, 45, -1.48F, 0.0F, -1.5F, 3, 1, 3, -0.01F, true));

        this.upperjawslope = new AdvancedModelRenderer(this);
        this.upperjawslope.setRotationPoint(0.02F, 0.0F, -1.5F);
        this.upperjaw.addChild(upperjawslope);
        this.setRotateAngle(upperjawslope, -0.4245F, 0.0F, 0.0F);
        this.upperjawslope.cubeList.add(new ModelBox(upperjawslope, 49, 54, -1.5F, 0.0F, 0.0F, 3, 1, 4, 0.01F, true));

        this.leftcheek = new AdvancedModelRenderer(this);
        this.leftcheek.setRotationPoint(-1.51F, 1.3F, -1.1F);
        this.upperjaw.addChild(leftcheek);
        this.setRotateAngle(leftcheek, 0.2972F, 0.0213F, -0.1061F);
        this.leftcheek.cubeList.add(new ModelBox(leftcheek, 45, 45, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.rightcheek = new AdvancedModelRenderer(this);
        this.rightcheek.setRotationPoint(1.51F, 1.3F, -1.1F);
        this.upperjaw.addChild(rightcheek);
        this.setRotateAngle(rightcheek, 0.2972F, -0.0213F, 0.1061F);
        this.rightcheek.cubeList.add(new ModelBox(rightcheek, 42, 43, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 3.3F, -3.1F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.1698F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 38, 50, -1.49F, 0.0F, -3.5F, 3, 1, 4, 0.0F, true));

        this.chin = new AdvancedModelRenderer(this);
        this.chin.setRotationPoint(-0.01F, 1.0F, -3.5F);
        this.lowerjaw.addChild(chin);
        this.setRotateAngle(chin, -0.4458F, 0.0F, 0.0F);
        this.chin.cubeList.add(new ModelBox(chin, 37, 41, -1.48F, -1.0F, 0.0F, 3, 1, 2, -0.01F, true));

        this.lowerjawunderside = new AdvancedModelRenderer(this);
        this.lowerjawunderside.setRotationPoint(0.01F, 0.9F, -1.4F);
        this.lowerjaw.addChild(lowerjawunderside);
        this.setRotateAngle(lowerjawunderside, 0.7854F, 0.0F, 0.0F);
        this.lowerjawunderside.cubeList.add(new ModelBox(lowerjawunderside, 49, 49, -1.5F, 0.0F, -1.0F, 3, 2, 2, 0.01F, true));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(-1.6F, -0.9F, -2.3F);
        this.head.addChild(lefteye);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 0, 4, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(1.6F, -0.9F, -2.3F);
        this.head.addChild(righteye);
        this.righteye.cubeList.add(new ModelBox(righteye, 0, 1, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.leftpectoralfin = new AdvancedModelRenderer(this);
        this.leftpectoralfin.setRotationPoint(-1.4F, 3.5F, -7.0F);
        this.bodyfront.addChild(leftpectoralfin);
        this.setRotateAngle(leftpectoralfin, 0.1274F, -0.4033F, 0.0F);
        this.leftpectoralfin.cubeList.add(new ModelBox(leftpectoralfin, 56, 16, 0.0F, -1.5F, 0.0F, 0, 3, 4, 0.0F, true));

        this.rightpectoralfin = new AdvancedModelRenderer(this);
        this.rightpectoralfin.setRotationPoint(1.4F, 3.5F, -7.0F);
        this.bodyfront.addChild(rightpectoralfin);
        this.setRotateAngle(rightpectoralfin, 0.1274F, 0.3821F, 0.0F);
        this.rightpectoralfin.cubeList.add(new ModelBox(rightpectoralfin, 56, 20, 0.0F, -1.5F, 0.0F, 0, 3, 4, 0.0F, true));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.2F;
        this.root.offsetX = -0.4F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(1);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 6.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetY = -0.125F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
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
        //this.body.offsetY = 1.35F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tailfin};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(leftpelvicfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(leftpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(leftpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(rightpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(rightpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);



            this.swing(root, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.root.rotateAngleZ = (float) Math.toRadians(270);
                this.root.offsetY = 1.0F;
                this.bob(root, -speed, 5F, false, f2, 1);
            }
        }
    }
}
