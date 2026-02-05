package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSecodontosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSecodontosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer Bodyfront_r1;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer Lowerjawmiddle_r1;
    private final AdvancedModelRenderer Lowerjawmiddle_r2;
    private final AdvancedModelRenderer jaw3;
    private final AdvancedModelRenderer Lowerjawfront_r1;
    private final AdvancedModelRenderer jaw4;
    private final AdvancedModelRenderer Lowerjawslope_r1;
    private final AdvancedModelRenderer jaw5;
    private final AdvancedModelRenderer Jawparting_r1;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer Upperjawback_r1;
    private final AdvancedModelRenderer Upperjawmiddle;
    private final AdvancedModelRenderer Upperjawmiddle_r1;
    private final AdvancedModelRenderer head3;
    private final AdvancedModelRenderer Nosebridge_r1;
    private final AdvancedModelRenderer head4;
    private final AdvancedModelRenderer Upperjawfront_r1;
    private final AdvancedModelRenderer head5;
    private final AdvancedModelRenderer Forehead_r1;
    private final AdvancedModelRenderer sail3;
    private final AdvancedModelRenderer Bodyfront_r2;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer rightArm4;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer leftArm4;
    private final AdvancedModelRenderer sail2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer sailbasetail;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer sail;
    private final AdvancedModelRenderer Bodyfront_r3;

    private ModelAnimator animator;

    public ModelSecodontosaurus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 2.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 11.55F, 5.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.1878F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 26, 10, -3.0F, -1.9511F, -0.9012F, 6, 8, 8, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.1511F, -0.3012F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1367F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -1.0F, -9.0F, 8, 9, 9, 0.0F, false));

        this.Bodyfront_r1 = new AdvancedModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 11.4F, -4.6F);
        this.body.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.048F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 0, 27, 0.0F, -26.3F, -3.25F, 0, 15, 8, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.1F, -8.4F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0494F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 18, -3.5F, -1.0F, -8.0F, 7, 9, 8, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.0F, -6.5F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.0456F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 46, 0, -2.5F, 0.0F, -5.0F, 5, 8, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.0F, -4.5F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0068F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 12, 49, -2.0F, -1.0F, -4.0F, 4, 6, 4, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.01F, 0.6F, -2.2F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.0543F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 25, 0, -1.99F, -1.5F, -4.5F, 4, 3, 5, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.45F, 0.25F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.144F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 48, 26, -1.99F, 0.0F, -4.75F, 4, 2, 5, 0.0F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.65F, -4.25F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.1911F, 0.0F, 0.0F);


        this.Lowerjawmiddle_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle_r1.setRotationPoint(-0.005F, 0.5622F, -1.8654F);
        this.jaw2.addChild(Lowerjawmiddle_r1);
        this.setRotateAngle(Lowerjawmiddle_r1, -0.0524F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 0, 21, -0.985F, -0.4042F, -1.3288F, 2, 1, 1, 0.0F, false));

        this.Lowerjawmiddle_r2 = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle_r2.setRotationPoint(-0.005F, 0.5622F, -1.8654F);
        this.jaw2.addChild(Lowerjawmiddle_r2);
        this.setRotateAngle(Lowerjawmiddle_r2, -0.0873F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r2.cubeList.add(new ModelBox(Lowerjawmiddle_r2, 61, 0, -1.485F, -0.3792F, -0.7288F, 3, 1, 3, -0.01F, false));

        this.jaw3 = new AdvancedModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.2335F, 0.0F, 0.0F);


        this.Lowerjawfront_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawfront_r1.setRotationPoint(0.02F, -1.0F, -0.95F);
        this.jaw3.addChild(Lowerjawfront_r1);
        this.setRotateAngle(Lowerjawfront_r1, 0.0436F, 0.0F, 0.0F);
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 25, 3, 0.65F, -1.4F, -3.4F, 0, 1, 5, 0.0F, true));
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 25, 3, -0.67F, -1.4F, -3.4F, 0, 1, 5, 0.0F, false));
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 9, 59, -1.01F, -1.0F, -3.475F, 2, 1, 5, -0.01F, false));

        this.jaw4 = new AdvancedModelRenderer(this);
        this.jaw4.setRotationPoint(-0.01F, -0.1F, -3.0F);
        this.jaw.addChild(jaw4);
        this.setRotateAngle(jaw4, 0.3768F, 0.0F, 0.0F);
        this.jaw4.cubeList.add(new ModelBox(jaw4, 0, 15, -1.15F, -0.6553F, -4.5544F, 0, 1, 3, 0.0F, false));
        this.jaw4.cubeList.add(new ModelBox(jaw4, 0, 15, 1.19F, -0.6553F, -4.5544F, 0, 1, 3, 0.0F, true));

        this.Lowerjawslope_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawslope_r1.setRotationPoint(0.005F, 0.9055F, -2.2131F);
        this.jaw4.addChild(Lowerjawslope_r1);
        this.setRotateAngle(Lowerjawslope_r1, 0.0436F, 0.0F, 0.0F);
        this.Lowerjawslope_r1.cubeList.add(new ModelBox(Lowerjawslope_r1, 38, 0, -1.485F, -1.2107F, -1.9913F, 3, 1, 3, 0.0F, false));

        this.jaw5 = new AdvancedModelRenderer(this);
        this.jaw5.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.jaw.addChild(jaw5);
        this.setRotateAngle(jaw5, -0.3183F, 0.0F, 0.0F);


        this.Jawparting_r1 = new AdvancedModelRenderer(this);
        this.Jawparting_r1.setRotationPoint(0.0F, -1.5F, 1.5F);
        this.jaw5.addChild(Jawparting_r1);
        this.setRotateAngle(Jawparting_r1, 0.1745F, 0.0F, 0.0F);
        this.Jawparting_r1.cubeList.add(new ModelBox(Jawparting_r1, 10, 65, -1.49F, -1.25F, -3.0F, 3, 3, 3, 0.0F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 1.4F, -4.0F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, -0.0119F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 6, 0, -0.75F, -0.075F, -4.35F, 0, 1, 1, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 6, 0, 0.77F, -0.075F, -4.35F, 0, 1, 1, 0.0F, true));

        this.Upperjawback_r1 = new AdvancedModelRenderer(this);
        this.Upperjawback_r1.setRotationPoint(0.01F, 10.55F, 21.0F);
        this.head2.addChild(Upperjawback_r1);
        this.setRotateAngle(Upperjawback_r1, -0.0436F, 0.0F, 0.0F);
        this.Upperjawback_r1.cubeList.add(new ModelBox(Upperjawback_r1, 0, 0, -1.0F, -11.125F, -25.75F, 2, 2, 2, 0.01F, false));

        this.Upperjawmiddle = new AdvancedModelRenderer(this);
        this.Upperjawmiddle.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.head2.addChild(Upperjawmiddle);
        this.setRotateAngle(Upperjawmiddle, -0.1143F, 0.0F, 0.0F);
        this.Upperjawmiddle.cubeList.add(new ModelBox(Upperjawmiddle, 5, 18, -0.75F, -2.1F, -3.3F, 0, 1, 1, 0.0F, false));
        this.Upperjawmiddle.cubeList.add(new ModelBox(Upperjawmiddle, 6, 17, -0.75F, -1.8F, -2.05F, 0, 1, 1, 0.0F, false));
        this.Upperjawmiddle.cubeList.add(new ModelBox(Upperjawmiddle, 6, 17, 0.77F, -1.8F, -2.05F, 0, 1, 1, 0.0F, true));
        this.Upperjawmiddle.cubeList.add(new ModelBox(Upperjawmiddle, 5, 18, 0.77F, -2.1F, -3.3F, 0, 1, 1, 0.0F, true));

        this.Upperjawmiddle_r1 = new AdvancedModelRenderer(this);
        this.Upperjawmiddle_r1.setRotationPoint(0.01F, 8.55F, 25.0F);
        this.Upperjawmiddle.addChild(Upperjawmiddle_r1);
        this.setRotateAngle(Upperjawmiddle_r1, 0.0175F, 0.0F, 0.0F);
        this.Upperjawmiddle_r1.cubeList.add(new ModelBox(Upperjawmiddle_r1, 65, 52, -1.0F, -11.65F, -28.2F, 2, 1, 3, 0.015F, false));

        this.head3 = new AdvancedModelRenderer(this);
        this.head3.setRotationPoint(0.0F, -3.975F, 0.15F);
        this.Upperjawmiddle.addChild(head3);
        this.setRotateAngle(head3, 0.5526F, 0.0F, 0.0F);


        this.Nosebridge_r1 = new AdvancedModelRenderer(this);
        this.Nosebridge_r1.setRotationPoint(0.0F, 1.5F, -1.5F);
        this.head3.addChild(Nosebridge_r1);
        this.setRotateAngle(Nosebridge_r1, -0.1745F, 0.0F, 0.0F);
        this.Nosebridge_r1.cubeList.add(new ModelBox(Nosebridge_r1, 58, 44, -0.99F, -1.8F, -3.65F, 2, 1, 5, 0.0F, false));

        this.head4 = new AdvancedModelRenderer(this);
        this.head4.setRotationPoint(-0.01F, -2.0F, -4.05F);
        this.Upperjawmiddle.addChild(head4);
        this.setRotateAngle(head4, 0.7383F, 0.0F, 0.0F);


        this.Upperjawfront_r1 = new AdvancedModelRenderer(this);
        this.Upperjawfront_r1.setRotationPoint(0.04F, 1.0F, -1.0F);
        this.head4.addChild(Upperjawfront_r1);
        this.setRotateAngle(Upperjawfront_r1, 0.1309F, 0.0F, 0.0F);
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 6, 19, 0.75F, -1.05F, 0.1F, 0, 1, 1, 0.0F, true));
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 6, 19, -0.79F, -1.05F, 0.1F, 0, 1, 1, 0.0F, false));
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 0, 19, -1.02F, -1.3F, 0.1F, 2, 1, 1, -0.005F, false));

        this.head5 = new AdvancedModelRenderer(this);
        this.head5.setRotationPoint(0.01F, -1.35F, -4.5F);
        this.head.addChild(head5);
        this.setRotateAngle(head5, 0.2311F, 0.0F, 0.0F);
        this.head5.cubeList.add(new ModelBox(head5, 59, 63, -1.5F, 0.0F, -3.0F, 3, 2, 3, 0.02F, false));
        this.head5.cubeList.add(new ModelBox(head5, 0, 0, -1.25F, 2.4F, -2.75F, 0, 1, 1, 0.0F, false));
        this.head5.cubeList.add(new ModelBox(head5, 0, 0, 1.25F, 2.5F, -2.75F, 0, 1, 1, 0.0F, true));

        this.Forehead_r1 = new AdvancedModelRenderer(this);
        this.Forehead_r1.setRotationPoint(0.0F, 12.55F, 21.5F);
        this.head5.addChild(Forehead_r1);
        this.setRotateAngle(Forehead_r1, -0.1396F, 0.0F, 0.0F);
        this.Forehead_r1.cubeList.add(new ModelBox(Forehead_r1, 22, 66, -1.5F, -7.55F, -25.725F, 3, 1, 3, 0.01F, false));

        this.sail3 = new AdvancedModelRenderer(this);
        this.sail3.setRotationPoint(0.0F, -0.25F, -1.5F);
        this.neck.addChild(sail3);


        this.Bodyfront_r2 = new AdvancedModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(0.0F, 12.55F, 11.8F);
        this.sail3.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, -0.0436F, 0.0F, 0.0F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 0, 0, 0.0F, -15.55F, -16.3F, 0, 5, 4, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.5F, 5.0F, -8.0F);
        this.chest.addChild(rightArm);


        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.1884F, -0.4816F, 0.8492F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 56, 55, -2.0F, -0.5F, -1.5F, 3, 5, 3, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.5F, 3.9F, 0.9F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -0.4896F, -0.0612F, -0.8287F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 0, 62, -1.0F, 0.0F, -2.5F, 2, 5, 3, 0.0F, true));

        this.rightArm4 = new AdvancedModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 4.4F, -0.5F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.0F, 0.2269F, 0.0F);
        this.rightArm4.cubeList.add(new ModelBox(rightArm4, 54, 18, -2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.5F, 5.0F, -8.0F);
        this.chest.addChild(leftArm);


        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.1884F, 0.4816F, -0.8492F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 56, 55, -1.0F, -0.5F, -1.5F, 3, 5, 3, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.5F, 3.9F, 0.9F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, -0.4896F, 0.0612F, 0.8287F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 0, 62, -1.0F, 0.0F, -2.5F, 2, 5, 3, 0.0F, false));

        this.leftArm4 = new AdvancedModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 4.4F, -0.5F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.0F, -0.2269F, 0.0F);
        this.leftArm4.cubeList.add(new ModelBox(leftArm4, 54, 18, -2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F, false));

        this.sail2 = new AdvancedModelRenderer(this);
        this.sail2.setRotationPoint(0.0F, -1.0F, 0.05F);
        this.chest.addChild(sail2);
        this.sail2.cubeList.add(new ModelBox(sail2, 16, 27, 0.0F, -13.0F, -8.0F, 0, 14, 8, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.8511F, 6.5988F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.093F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 32, 40, -2.0F, -1.0F, 0.0F, 4, 6, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.4F, 6.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.081F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 47, 33, -1.5F, -1.0F, 0.0F, 3, 4, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0583F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 46, 45, -1.0F, -0.5F, 0.0F, 2, 2, 8, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.3F, 7.2F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1562F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 53, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.sailbasetail = new AdvancedModelRenderer(this);
        this.sailbasetail.setRotationPoint(0.0F, 0.6F, 0.4F);
        this.tail.addChild(sailbasetail);
        this.setRotateAngle(sailbasetail, -0.182F, 0.0F, 0.0F);


        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.5F, 2.5489F, 4.5988F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2022F, 0.3976F, 0.2828F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 37, 60, -2.0F, -0.5F, -1.5F, 3, 4, 3, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.7F, 3.0F, -1.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.5466F, 0.1274F, -0.0848F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 61, 23, -1.0F, 0.0F, -0.5F, 2, 5, 3, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 4.2F, 1.5F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.0436F, -0.002F, -0.0518F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 28, 53, -2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.5F, 2.5489F, 4.5988F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.2022F, -0.3976F, -0.2828F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 60, 33, -1.0F, -0.5F, -1.5F, 3, 4, 3, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.7F, 3.0F, -1.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.5466F, -0.1274F, 0.0848F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 49, 60, -1.0F, 0.0F, -0.5F, 2, 5, 3, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 4.2F, 1.5F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.0436F, -0.002F, 0.0518F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 46, 13, -2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F, false));

        this.sail = new AdvancedModelRenderer(this);
        this.sail.setRotationPoint(0.0F, -1.9511F, -0.9512F);
        this.hips.addChild(sail);


        this.Bodyfront_r3 = new AdvancedModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(0.0F, 12.2F, -4.0F);
        this.sail.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, 0.1789F, 0.0F, 0.0F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 32, 18, 0.0F, -23.8F, 6.15F, 0, 14, 8, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0.2F;
        this.root.offsetX = 0.35F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(1);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 0.6F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetY = -0.105F;
        this.root.render(0.01F);
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
        //this.resetToDefaultPose();

        EntityPrehistoricFloraSecodontosaurus EntityMegalosaurus = (EntityPrehistoricFloraSecodontosaurus) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSecodontosaurus entity = (EntityPrehistoricFloraSecodontosaurus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 15.25 + (((tickAnim - 4) / 5) * (-6.5-(15.25)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -6.5 + (((tickAnim - 9) / 4) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -8.25 + (((tickAnim - 4) / 5) * (-8.75-(-8.25)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -8.75 + (((tickAnim - 9) / 2) * (1.5-(-8.75)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 1.5 + (((tickAnim - 11) / 2) * (0-(1.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -5.25 + (((tickAnim - 4) / 3) * (-10.38-(-5.25)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -10.38 + (((tickAnim - 7) / 2) * (4-(-10.38)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 4 + (((tickAnim - 9) / 2) * (7.25-(4)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 7.25 + (((tickAnim - 11) / 2) * (0-(7.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 3.75 + (((tickAnim - 4) / 5) * (27.25-(3.75)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 27.25 + (((tickAnim - 9) / 2) * (0-(27.25)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 3.5 + (((tickAnim - 4) / 5) * (0-(3.5)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sail3, sail3.rotateAngleX + (float) Math.toRadians(xx), sail3.rotateAngleY + (float) Math.toRadians(yy), sail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.575-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.1 + (((tickAnim - 4) / 5) * (0-(0.1)));
            zz = 0.575 + (((tickAnim - 4) / 5) * (0-(0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sail3.rotationPointX = this.sail3.rotationPointX + (float)(xx);
        this.sail3.rotationPointY = this.sail3.rotationPointY - (float)(yy);
        this.sail3.rotationPointZ = this.sail3.rotationPointZ + (float)(zz);
        
    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSecodontosaurus entity = (EntityPrehistoricFloraSecodontosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.75 + (((tickAnim - 10) / 10) * (0-(8.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 6.75 + (((tickAnim - 10) / 10) * (0-(6.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (19.97807-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.08815-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.04339-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 19.97807 + (((tickAnim - 5) / 5) * (17.95614-(19.97807)));
            yy = -1.08815 + (((tickAnim - 5) / 5) * (-2.17629-(-1.08815)));
            zz = 0.04339 + (((tickAnim - 5) / 5) * (0.08679-(0.04339)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.95614 + (((tickAnim - 10) / 10) * (0-(17.95614)));
            yy = -2.17629 + (((tickAnim - 10) / 10) * (0-(-2.17629)));
            zz = 0.08679 + (((tickAnim - 10) / 10) * (0-(0.08679)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.15 + (((tickAnim - 10) / 10) * (0-(0.15)));
            zz = -1 + (((tickAnim - 10) / 10) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 10.5 + (((tickAnim - 5) / 5) * (0-(10.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.4-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.4 + (((tickAnim - 10) / 10) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sail3.rotationPointX = this.sail3.rotationPointX + (float)(xx);
        this.sail3.rotationPointY = this.sail3.rotationPointY - (float)(yy);
        this.sail3.rotationPointZ = this.sail3.rotationPointZ + (float)(zz);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSecodontosaurus entity = (EntityPrehistoricFloraSecodontosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (65.63764-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (24.3841-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (15.13811-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 65.63764 + (((tickAnim - 15) / 7) * (-8.87079-(65.63764)));
            yy = 24.3841 + (((tickAnim - 15) / 7) * (8.12803-(24.3841)));
            zz = 15.13811 + (((tickAnim - 15) / 7) * (5.04604-(15.13811)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -8.87079 + (((tickAnim - 22) / 3) * (0-(-8.87079)));
            yy = 8.12803 + (((tickAnim - 22) / 3) * (0-(8.12803)));
            zz = 5.04604 + (((tickAnim - 22) / 3) * (0-(5.04604)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (65.63764-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (24.3841-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (15.13811-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 65.63764 + (((tickAnim - 40) / 7) * (-8.87079-(65.63764)));
            yy = 24.3841 + (((tickAnim - 40) / 7) * (8.12803-(24.3841)));
            zz = 15.13811 + (((tickAnim - 40) / 7) * (5.04604-(15.13811)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -8.87079 + (((tickAnim - 47) / 3) * (0-(-8.87079)));
            yy = 8.12803 + (((tickAnim - 47) / 3) * (0-(8.12803)));
            zz = 5.04604 + (((tickAnim - 47) / 3) * (0-(5.04604)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 1.75 + (((tickAnim - 15) / 7) * (16.08-(1.75)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 16.08 + (((tickAnim - 22) / 3) * (0-(16.08)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (1.75-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 1.75 + (((tickAnim - 40) / 7) * (16.08-(1.75)));
            yy = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 16.08 + (((tickAnim - 47) / 3) * (0-(16.08)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0.5 + (((tickAnim - 15) / 7) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 15) / 7) * (-0.625-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 22) / 3) * (0-(0.5)));
            zz = -0.625 + (((tickAnim - 22) / 3) * (0-(-0.625)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0.5-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            yy = 0.5 + (((tickAnim - 40) / 7) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 40) / 7) * (-0.625-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 47) / 3) * (0-(0.5)));
            zz = -0.625 + (((tickAnim - 47) / 3) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-26-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -26 + (((tickAnim - 5) / 10) * (50.5-(-26)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 50.5 + (((tickAnim - 15) / 7) * (70.33-(50.5)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 70.33 + (((tickAnim - 22) / 3) * (0-(70.33)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (-26-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -26 + (((tickAnim - 30) / 10) * (50.5-(-26)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 50.5 + (((tickAnim - 40) / 7) * (70.33-(50.5)));
            yy = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 70.33 + (((tickAnim - 47) / 3) * (0-(70.33)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0.575-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (-0.475-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0.575 + (((tickAnim - 15) / 7) * (1.64-(0.575)));
            zz = -0.475 + (((tickAnim - 15) / 7) * (-0.16-(-0.475)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 1.64 + (((tickAnim - 22) / 3) * (0-(1.64)));
            zz = -0.16 + (((tickAnim - 22) / 3) * (0-(-0.16)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0.575-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (-0.475-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            yy = 0.575 + (((tickAnim - 40) / 7) * (1.64-(0.575)));
            zz = -0.475 + (((tickAnim - 40) / 7) * (-0.16-(-0.475)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 1.64 + (((tickAnim - 47) / 3) * (0-(1.64)));
            zz = -0.16 + (((tickAnim - 47) / 3) * (0-(-0.16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSecodontosaurus entity = (EntityPrehistoricFloraSecodontosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.125-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -2.125 + (((tickAnim - 15) / 20) * (-2.125-(-2.125)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -2.125 + (((tickAnim - 35) / 15) * (0-(-2.125)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -3 + (((tickAnim - 15) / 20) * (-3-(-3)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 35) / 15) * (0-(-3)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -5.25 + (((tickAnim - 8) / 7) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -5.75 + (((tickAnim - 43) / 7) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 11.75 + (((tickAnim - 15) / 20) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 35) / 15) * (0-(11.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -22.25 + (((tickAnim - 15) / 20) * (-22.25-(-22.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -22.25 + (((tickAnim - 35) / 15) * (0-(-22.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (44.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 44.5 + (((tickAnim - 15) / 20) * (44.5-(44.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 44.5 + (((tickAnim - 35) / 15) * (0-(44.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.225-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.5 + (((tickAnim - 15) / 20) * (-0.5-(-0.5)));
            zz = -0.225 + (((tickAnim - 15) / 20) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.5 + (((tickAnim - 35) / 15) * (0-(-0.5)));
            zz = -0.225 + (((tickAnim - 35) / 15) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -21.25 + (((tickAnim - 15) / 20) * (-21.25-(-21.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -21.25 + (((tickAnim - 35) / 15) * (0-(-21.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -22.25 + (((tickAnim - 15) / 20) * (-22.25-(-22.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -22.25 + (((tickAnim - 35) / 15) * (0-(-22.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (44.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 44.5 + (((tickAnim - 15) / 20) * (44.5-(44.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 44.5 + (((tickAnim - 35) / 15) * (0-(44.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.225-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.5 + (((tickAnim - 15) / 20) * (-0.5-(-0.5)));
            zz = -0.225 + (((tickAnim - 15) / 20) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.5 + (((tickAnim - 35) / 15) * (0-(-0.5)));
            zz = -0.225 + (((tickAnim - 35) / 15) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -21.25 + (((tickAnim - 15) / 20) * (-21.25-(-21.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -21.25 + (((tickAnim - 35) / 15) * (0-(-21.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-47.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -47.75 + (((tickAnim - 15) / 20) * (-47.75-(-47.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -47.75 + (((tickAnim - 35) / 15) * (0-(-47.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.475-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.6 + (((tickAnim - 15) / 20) * (-0.6-(-0.6)));
            zz = -0.475 + (((tickAnim - 15) / 20) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.6 + (((tickAnim - 35) / 15) * (0-(-0.6)));
            zz = -0.475 + (((tickAnim - 35) / 15) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (44.70419-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.76363-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (7.51572-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 44.70419 + (((tickAnim - 15) / 20) * (44.70419-(44.70419)));
            yy = -1.76363 + (((tickAnim - 15) / 20) * (-1.76363-(-1.76363)));
            zz = 7.51572 + (((tickAnim - 15) / 20) * (7.51572-(7.51572)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 44.70419 + (((tickAnim - 35) / 15) * (0-(44.70419)));
            yy = -1.76363 + (((tickAnim - 35) / 15) * (0-(-1.76363)));
            zz = 7.51572 + (((tickAnim - 35) / 15) * (0-(7.51572)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(xx), rightArm4.rotateAngleY + (float) Math.toRadians(yy), rightArm4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.3-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.75 + (((tickAnim - 15) / 20) * (0.75-(0.75)));
            zz = -0.3 + (((tickAnim - 15) / 20) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.75 + (((tickAnim - 35) / 15) * (0-(0.75)));
            zz = -0.3 + (((tickAnim - 35) / 15) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm4.rotationPointX = this.rightArm4.rotationPointX + (float)(xx);
        this.rightArm4.rotationPointY = this.rightArm4.rotationPointY - (float)(yy);
        this.rightArm4.rotationPointZ = this.rightArm4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-47.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -47.75 + (((tickAnim - 15) / 20) * (-47.75-(-47.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -47.75 + (((tickAnim - 35) / 15) * (0-(-47.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.475-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.6 + (((tickAnim - 15) / 20) * (-0.6-(-0.6)));
            zz = -0.475 + (((tickAnim - 15) / 20) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.6 + (((tickAnim - 35) / 15) * (0-(-0.6)));
            zz = -0.475 + (((tickAnim - 35) / 15) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (44.70419-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.76363-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-7.51572-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 44.70419 + (((tickAnim - 15) / 20) * (44.70419-(44.70419)));
            yy = 1.76363 + (((tickAnim - 15) / 20) * (1.76363-(1.76363)));
            zz = -7.51572 + (((tickAnim - 15) / 20) * (-7.51572-(-7.51572)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 44.70419 + (((tickAnim - 35) / 15) * (0-(44.70419)));
            yy = 1.76363 + (((tickAnim - 35) / 15) * (0-(1.76363)));
            zz = -7.51572 + (((tickAnim - 35) / 15) * (0-(-7.51572)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(xx), leftArm4.rotateAngleY + (float) Math.toRadians(yy), leftArm4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.3-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.75 + (((tickAnim - 15) / 20) * (0.75-(0.75)));
            zz = -0.3 + (((tickAnim - 15) / 20) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.75 + (((tickAnim - 35) / 15) * (0-(0.75)));
            zz = -0.3 + (((tickAnim - 35) / 15) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm4.rotationPointX = this.leftArm4.rotationPointX + (float)(xx);
        this.leftArm4.rotationPointY = this.leftArm4.rotationPointY - (float)(yy);
        this.leftArm4.rotationPointZ = this.leftArm4.rotationPointZ + (float)(zz);

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSecodontosaurus entity = (EntityPrehistoricFloraSecodontosaurus) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -6 + (((tickAnim - 18) / 10) * (0-(-6)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -7.75 + (((tickAnim - 18) / 10) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 4.75 + (((tickAnim - 18) / 10) * (0-(4.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 27.75 + (((tickAnim - 18) / 10) * (0-(27.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSecodontosaurus entity = (EntityPrehistoricFloraSecodontosaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.5 + (((tickAnim - 5) / 3) * (2.5034-(2.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.15606-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-2.49513-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.5034 + (((tickAnim - 8) / 1) * (2.5034-(2.5034)));
            yy = -0.15606 + (((tickAnim - 8) / 1) * (0.15606-(-0.15606)));
            zz = -2.49513 + (((tickAnim - 8) / 1) * (2.49513-(-2.49513)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 2.5034 + (((tickAnim - 9) / 2) * (2.5034-(2.5034)));
            yy = 0.15606 + (((tickAnim - 9) / 2) * (-0.15606-(0.15606)));
            zz = 2.49513 + (((tickAnim - 9) / 2) * (-2.49513-(2.49513)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 2.5034 + (((tickAnim - 11) / 2) * (2.5034-(2.5034)));
            yy = -0.15606 + (((tickAnim - 11) / 2) * (0.15606-(-0.15606)));
            zz = -2.49513 + (((tickAnim - 11) / 2) * (2.49513-(-2.49513)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 2.5034 + (((tickAnim - 13) / 1) * (2.5034-(2.5034)));
            yy = 0.15606 + (((tickAnim - 13) / 1) * (-0.15606-(0.15606)));
            zz = 2.49513 + (((tickAnim - 13) / 1) * (-2.49513-(2.49513)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 2.5034 + (((tickAnim - 14) / 2) * (2.5034-(2.5034)));
            yy = -0.15606 + (((tickAnim - 14) / 2) * (0.15606-(-0.15606)));
            zz = -2.49513 + (((tickAnim - 14) / 2) * (2.49513-(-2.49513)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 2.5034 + (((tickAnim - 16) / 2) * (2.5034-(2.5034)));
            yy = 0.15606 + (((tickAnim - 16) / 2) * (-0.15606-(0.15606)));
            zz = 2.49513 + (((tickAnim - 16) / 2) * (-2.49513-(2.49513)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 2.5034 + (((tickAnim - 18) / 1) * (2.5034-(2.5034)));
            yy = -0.15606 + (((tickAnim - 18) / 1) * (0.15606-(-0.15606)));
            zz = -2.49513 + (((tickAnim - 18) / 1) * (2.49513-(-2.49513)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 2.5034 + (((tickAnim - 19) / 2) * (2.5034-(2.5034)));
            yy = 0.15606 + (((tickAnim - 19) / 2) * (-0.15606-(0.15606)));
            zz = 2.49513 + (((tickAnim - 19) / 2) * (-2.49513-(2.49513)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 2.5034 + (((tickAnim - 21) / 2) * (2.5-(2.5034)));
            yy = -0.15606 + (((tickAnim - 21) / 2) * (0-(-0.15606)));
            zz = -2.49513 + (((tickAnim - 21) / 2) * (0-(-2.49513)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 23) / 7) * (0-(2.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -5 + (((tickAnim - 5) / 2) * (-4.99872-(-5)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.05888-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-2.49931-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -4.99872 + (((tickAnim - 7) / 1) * (-4.99872-(-4.99872)));
            yy = -0.05888 + (((tickAnim - 7) / 1) * (0.05888-(-0.05888)));
            zz = -2.49931 + (((tickAnim - 7) / 1) * (2.49931-(-2.49931)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.99872 + (((tickAnim - 8) / 2) * (-4.99872-(-4.99872)));
            yy = 0.05888 + (((tickAnim - 8) / 2) * (-0.05888-(0.05888)));
            zz = 2.49931 + (((tickAnim - 8) / 2) * (-2.49931-(2.49931)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -4.99872 + (((tickAnim - 10) / 2) * (-4.99872-(-4.99872)));
            yy = -0.05888 + (((tickAnim - 10) / 2) * (0.05888-(-0.05888)));
            zz = -2.49931 + (((tickAnim - 10) / 2) * (2.49931-(-2.49931)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -4.99872 + (((tickAnim - 12) / 1) * (-4.99872-(-4.99872)));
            yy = 0.05888 + (((tickAnim - 12) / 1) * (-0.05888-(0.05888)));
            zz = 2.49931 + (((tickAnim - 12) / 1) * (-2.49931-(2.49931)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -4.99872 + (((tickAnim - 13) / 2) * (-4.99872-(-4.99872)));
            yy = -0.05888 + (((tickAnim - 13) / 2) * (0.05888-(-0.05888)));
            zz = -2.49931 + (((tickAnim - 13) / 2) * (2.49931-(-2.49931)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -4.99872 + (((tickAnim - 15) / 2) * (-4.99872-(-4.99872)));
            yy = 0.05888 + (((tickAnim - 15) / 2) * (-0.05888-(0.05888)));
            zz = 2.49931 + (((tickAnim - 15) / 2) * (-2.49931-(2.49931)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -4.99872 + (((tickAnim - 17) / 1) * (-4.99872-(-4.99872)));
            yy = -0.05888 + (((tickAnim - 17) / 1) * (0.05888-(-0.05888)));
            zz = -2.49931 + (((tickAnim - 17) / 1) * (2.49931-(-2.49931)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -4.99872 + (((tickAnim - 18) / 2) * (-4.99872-(-4.99872)));
            yy = 0.05888 + (((tickAnim - 18) / 2) * (-0.05888-(0.05888)));
            zz = 2.49931 + (((tickAnim - 18) / 2) * (-2.49931-(2.49931)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -4.99872 + (((tickAnim - 20) / 2) * (-5-(-4.99872)));
            yy = -0.05888 + (((tickAnim - 20) / 2) * (0-(-0.05888)));
            zz = -2.49931 + (((tickAnim - 20) / 2) * (0-(-2.49931)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 22) / 8) * (0-(-5)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -5 + (((tickAnim - 5) / 2) * (2.34699-(-5)));
            yy = 0 + (((tickAnim - 5) / 2) * (1.61004-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-14.88645-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 2.34699 + (((tickAnim - 7) / 2) * (2.34699-(2.34699)));
            yy = 1.61004 + (((tickAnim - 7) / 2) * (-1.61004-(1.61004)));
            zz = -14.88645 + (((tickAnim - 7) / 2) * (14.88645-(-14.88645)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 2.34699 + (((tickAnim - 9) / 3) * (2.34699-(2.34699)));
            yy = -1.61004 + (((tickAnim - 9) / 3) * (1.61004-(-1.61004)));
            zz = 14.88645 + (((tickAnim - 9) / 3) * (-14.88645-(14.88645)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 2.34699 + (((tickAnim - 12) / 2) * (2.34699-(2.34699)));
            yy = 1.61004 + (((tickAnim - 12) / 2) * (-1.61004-(1.61004)));
            zz = -14.88645 + (((tickAnim - 12) / 2) * (14.88645-(-14.88645)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 2.34699 + (((tickAnim - 14) / 3) * (2.34699-(2.34699)));
            yy = -1.61004 + (((tickAnim - 14) / 3) * (1.61004-(-1.61004)));
            zz = 14.88645 + (((tickAnim - 14) / 3) * (-14.88645-(14.88645)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 2.34699 + (((tickAnim - 17) / 3) * (-5-(2.34699)));
            yy = 1.61004 + (((tickAnim - 17) / 3) * (0-(1.61004)));
            zz = -14.88645 + (((tickAnim - 17) / 3) * (0-(-14.88645)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 20) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 10 + (((tickAnim - 25) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSecodontosaurus entity = (EntityPrehistoricFloraSecodontosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-90))*3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+30))*5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-70))*0.8);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*-0.8);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*-3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60))*-5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*2), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+100))*3), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-250))*2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*-4), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*-3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-350))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-300))*-3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*-3), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*5), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-100))*-6), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*9), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-230))*10), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*13), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(3.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-350))*15), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*17), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*3));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 0) / 8) * (72.0066-(-5)));
            yy = 0 + (((tickAnim - 0) / 8) * (-14.92976-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (22.86942-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 72.0066 + (((tickAnim - 8) / 5) * (-8.29417-(72.0066)));
            yy = -14.92976 + (((tickAnim - 8) / 5) * (-6.65088-(-14.92976)));
            zz = 22.86942 + (((tickAnim - 8) / 5) * (33.12975-(22.86942)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -8.29417 + (((tickAnim - 13) / 2) * (-5-(-8.29417)));
            yy = -6.65088 + (((tickAnim - 13) / 2) * (0-(-6.65088)));
            zz = 33.12975 + (((tickAnim - 13) / 2) * (0-(33.12975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -21.57724 + (((tickAnim - 0) / 8) * (-16.5-(-21.57724)));
            yy = -6.88311 + (((tickAnim - 0) / 8) * (0-(-6.88311)));
            zz = -11.57514 + (((tickAnim - 0) / 8) * (0-(-11.57514)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -16.5 + (((tickAnim - 8) / 5) * (28.02637-(-16.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (4.16665-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-7.87281-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 28.02637 + (((tickAnim - 13) / 2) * (-21.57724-(28.02637)));
            yy = 4.16665 + (((tickAnim - 13) / 2) * (-6.88311-(4.16665)));
            zz = -7.87281 + (((tickAnim - 13) / 2) * (-11.57514-(-7.87281)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 8) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (-0.12-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.175-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.12 + (((tickAnim - 13) / 2) * (-0.225-(-0.12)));
            zz = -0.175 + (((tickAnim - 13) / 2) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.92321 + (((tickAnim - 0) / 3) * (-5.8627-(27.92321)));
            yy = -1.93551 + (((tickAnim - 0) / 3) * (-1.19449-(-1.93551)));
            zz = 4.0634 + (((tickAnim - 0) / 3) * (-7.40481-(4.0634)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -5.8627 + (((tickAnim - 3) / 5) * (74.25-(-5.8627)));
            yy = -1.19449 + (((tickAnim - 3) / 5) * (0-(-1.19449)));
            zz = -7.40481 + (((tickAnim - 3) / 5) * (0-(-7.40481)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 74.25 + (((tickAnim - 8) / 2) * (97.42-(74.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 97.42 + (((tickAnim - 10) / 3) * (75.51-(97.42)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 75.51 + (((tickAnim - 13) / 1) * (12.88076-(75.51)));
            yy = 0 + (((tickAnim - 13) / 1) * (-4.00905-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (10.52003-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 12.88076 + (((tickAnim - 14) / 1) * (27.92321-(12.88076)));
            yy = -4.00905 + (((tickAnim - 14) / 1) * (-1.93551-(-4.00905)));
            zz = 10.52003 + (((tickAnim - 14) / 1) * (4.0634-(10.52003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 0) / 2) * (0.315-(0.6)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.09-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.315 + (((tickAnim - 2) / 1) * (-0.275-(0.315)));
            zz = -0.09 + (((tickAnim - 2) / 1) * (0-(-0.09)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.275 + (((tickAnim - 3) / 4) * (1.64-(-0.275)));
            zz = 0 + (((tickAnim - 3) / 4) * (-0.26-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.64 + (((tickAnim - 7) / 1) * (0.7-(1.64)));
            zz = -0.26 + (((tickAnim - 7) / 1) * (-0.35-(-0.26)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.7 + (((tickAnim - 8) / 5) * (1.38-(0.7)));
            zz = -0.35 + (((tickAnim - 8) / 5) * (-0.76-(-0.35)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 1.38 + (((tickAnim - 13) / 1) * (0-(1.38)));
            zz = -0.76 + (((tickAnim - 13) / 1) * (0-(-0.76)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 1) * (0.6-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 72.0066 + (((tickAnim - 0) / 3) * (-8.29417-(72.0066)));
            yy = 14.92976 + (((tickAnim - 0) / 3) * (6.65088-(14.92976)));
            zz = -22.86942 + (((tickAnim - 0) / 3) * (-33.12975-(-22.86942)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -8.29417 + (((tickAnim - 3) / 4) * (-5-(-8.29417)));
            yy = 6.65088 + (((tickAnim - 3) / 4) * (0-(6.65088)));
            zz = -33.12975 + (((tickAnim - 3) / 4) * (0-(-33.12975)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 7) / 8) * (72.0066-(-5)));
            yy = 0 + (((tickAnim - 7) / 8) * (14.92976-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (-22.86942-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -16.5 + (((tickAnim - 0) / 3) * (28.02637-(-16.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (4.16665-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-7.87281-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 28.02637 + (((tickAnim - 3) / 4) * (-21.57724-(28.02637)));
            yy = 4.16665 + (((tickAnim - 3) / 4) * (6.88311-(4.16665)));
            zz = -7.87281 + (((tickAnim - 3) / 4) * (11.57514-(-7.87281)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -21.57724 + (((tickAnim - 7) / 8) * (-16.5-(-21.57724)));
            yy = 6.88311 + (((tickAnim - 7) / 8) * (0-(6.88311)));
            zz = 11.57514 + (((tickAnim - 7) / 8) * (0-(11.57514)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.12-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.175-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.12 + (((tickAnim - 3) / 4) * (-0.225-(-0.12)));
            zz = -0.175 + (((tickAnim - 3) / 4) * (0-(-0.175)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = -0.225 + (((tickAnim - 7) / 8) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 74.25 + (((tickAnim - 0) / 1) * (97.42-(74.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 97.42 + (((tickAnim - 1) / 2) * (75.51-(97.42)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 75.51 + (((tickAnim - 3) / 3) * (12.88076-(75.51)));
            yy = 0 + (((tickAnim - 3) / 3) * (-4.00905-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (10.52003-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 12.88076 + (((tickAnim - 6) / 1) * (27.92321-(12.88076)));
            yy = -4.00905 + (((tickAnim - 6) / 1) * (1.93551-(-4.00905)));
            zz = 10.52003 + (((tickAnim - 6) / 1) * (-4.0634-(10.52003)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 27.92321 + (((tickAnim - 7) / 3) * (-5.8627-(27.92321)));
            yy = 1.93551 + (((tickAnim - 7) / 3) * (1.19449-(1.93551)));
            zz = -4.0634 + (((tickAnim - 7) / 3) * (7.40481-(-4.0634)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -5.8627 + (((tickAnim - 10) / 5) * (74.25-(-5.8627)));
            yy = 1.19449 + (((tickAnim - 10) / 5) * (0-(1.19449)));
            zz = 7.40481 + (((tickAnim - 10) / 5) * (0-(7.40481)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.7 + (((tickAnim - 0) / 3) * (1.38-(0.7)));
            zz = -0.35 + (((tickAnim - 0) / 3) * (-0.76-(-0.35)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.38 + (((tickAnim - 3) / 3) * (0-(1.38)));
            zz = -0.76 + (((tickAnim - 3) / 3) * (0-(-0.76)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0.6-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.6 + (((tickAnim - 7) / 1) * (0.315-(0.6)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.09-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.315 + (((tickAnim - 8) / 2) * (-0.275-(0.315)));
            zz = -0.09 + (((tickAnim - 8) / 2) * (0-(-0.09)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -0.275 + (((tickAnim - 10) / 3) * (1.64-(-0.275)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.26-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.64 + (((tickAnim - 13) / 2) * (0.7-(1.64)));
            zz = -0.26 + (((tickAnim - 13) / 2) * (-0.35-(-0.26)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(sail2, sail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*1.5), sail2.rotateAngleY + (float) Math.toRadians(0), sail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-110))*-3.5));
        this.sail2.rotationPointX = this.sail2.rotationPointX + (float)(0);
        this.sail2.rotationPointY = this.sail2.rotationPointY - (float)(-0.25);
        this.sail2.rotationPointZ = this.sail2.rotationPointZ + (float)(0.2);


        this.setRotateAngle(sail, sail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*-1.5), sail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+30))*1), sail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-140))*-3));
        this.sail.rotationPointX = this.sail.rotationPointX + (float)(0);
        this.sail.rotationPointY = this.sail.rotationPointY - (float)(0);
        this.sail.rotationPointZ = this.sail.rotationPointZ + (float)(-0.15);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 42.93315 + (((tickAnim - 0) / 4) * (-113.46687-(42.93315)));
            yy = 15.04975 + (((tickAnim - 0) / 4) * (38.38757-(15.04975)));
            zz = 13.33482 + (((tickAnim - 0) / 4) * (-58.36899-(13.33482)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -113.46687 + (((tickAnim - 4) / 4) * (-73.70924-(-113.46687)));
            yy = 38.38757 + (((tickAnim - 4) / 4) * (44.51569-(38.38757)));
            zz = -58.36899 + (((tickAnim - 4) / 4) * (-50.69688-(-58.36899)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -73.70924 + (((tickAnim - 8) / 4) * (-19.09618-(-73.70924)));
            yy = 44.51569 + (((tickAnim - 8) / 4) * (33.60811-(44.51569)));
            zz = -50.69688 + (((tickAnim - 8) / 4) * (-9.49659-(-50.69688)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -19.09618 + (((tickAnim - 12) / 3) * (42.93315-(-19.09618)));
            yy = 33.60811 + (((tickAnim - 12) / 3) * (15.04975-(33.60811)));
            zz = -9.49659 + (((tickAnim - 12) / 3) * (13.33482-(-9.49659)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0.39-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.53-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 0.39 + (((tickAnim - 1) / 3) * (1.415-(0.39)));
            yy = -0.05 + (((tickAnim - 1) / 3) * (-0.2-(-0.05)));
            zz = 0.53 + (((tickAnim - 1) / 3) * (-1.77-(0.53)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 1.415 + (((tickAnim - 4) / 4) * (1.1-(1.415)));
            yy = -0.2 + (((tickAnim - 4) / 4) * (0-(-0.2)));
            zz = -1.77 + (((tickAnim - 4) / 4) * (-1.075-(-1.77)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1.1 + (((tickAnim - 8) / 7) * (0-(1.1)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -1.075 + (((tickAnim - 8) / 7) * (0-(-1.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 76.61623 + (((tickAnim - 0) / 1) * (100.36287-(76.61623)));
            yy = -6.80339 + (((tickAnim - 0) / 1) * (-5.94331-(-6.80339)));
            zz = -11.24259 + (((tickAnim - 0) / 1) * (-9.07819-(-11.24259)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 100.36287 + (((tickAnim - 1) / 3) * (117.43724-(100.36287)));
            yy = -5.94331 + (((tickAnim - 1) / 3) * (-3.64974-(-5.94331)));
            zz = -9.07819 + (((tickAnim - 1) / 3) * (-3.30646-(-9.07819)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 117.43724 + (((tickAnim - 4) / 3) * (23.75-(117.43724)));
            yy = -3.64974 + (((tickAnim - 4) / 3) * (0-(-3.64974)));
            zz = -3.30646 + (((tickAnim - 4) / 3) * (0-(-3.30646)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 23.75 + (((tickAnim - 7) / 1) * (19.93758-(23.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.48242-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (-2.5732-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 19.93758 + (((tickAnim - 8) / 4) * (-5.49016-(19.93758)));
            yy = 0.48242 + (((tickAnim - 8) / 4) * (-5.16923-(0.48242)));
            zz = -2.5732 + (((tickAnim - 8) / 4) * (-7.13023-(-2.5732)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -5.49016 + (((tickAnim - 12) / 3) * (76.61623-(-5.49016)));
            yy = -5.16923 + (((tickAnim - 12) / 3) * (-6.80339-(-5.16923)));
            zz = -7.13023 + (((tickAnim - 12) / 3) * (-11.24259-(-7.13023)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(xx), rightArm4.rotateAngleY + (float) Math.toRadians(yy), rightArm4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 1.65 + (((tickAnim - 0) / 1) * (1.38-(1.65)));
            zz = -1.2 + (((tickAnim - 0) / 1) * (-1.435-(-1.2)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            yy = 1.38 + (((tickAnim - 1) / 3) * (0.73-(1.38)));
            zz = -1.435 + (((tickAnim - 1) / 3) * (-1.44-(-1.435)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.73 + (((tickAnim - 4) / 3) * (0.6-(0.73)));
            zz = -1.44 + (((tickAnim - 4) / 3) * (0-(-1.44)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.6 + (((tickAnim - 7) / 1) * (0.8-(0.6)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.8 + (((tickAnim - 8) / 4) * (0.08-(0.8)));
            zz = 0 + (((tickAnim - 8) / 4) * (0.06-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.08 + (((tickAnim - 12) / 3) * (1.65-(0.08)));
            zz = 0.06 + (((tickAnim - 12) / 3) * (-1.2-(0.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm4.rotationPointX = this.rightArm4.rotationPointX + (float)(xx);
        this.rightArm4.rotationPointY = this.rightArm4.rotationPointY - (float)(yy);
        this.rightArm4.rotationPointZ = this.rightArm4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -93.88171 + (((tickAnim - 0) / 4) * (-34.8226-(-93.88171)));
            yy = -27.6058 + (((tickAnim - 0) / 4) * (-46.18242-(-27.6058)));
            zz = 71.33878 + (((tickAnim - 0) / 4) * (29.09521-(71.33878)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -34.8226 + (((tickAnim - 4) / 4) * (42.93315-(-34.8226)));
            yy = -46.18242 + (((tickAnim - 4) / 4) * (-15.04975-(-46.18242)));
            zz = 29.09521 + (((tickAnim - 4) / 4) * (13.33482-(29.09521)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 42.93315 + (((tickAnim - 8) / 5) * (-113.46687-(42.93315)));
            yy = -15.04975 + (((tickAnim - 8) / 5) * (-38.38757-(-15.04975)));
            zz = 13.33482 + (((tickAnim - 8) / 5) * (58.36899-(13.33482)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -113.46687 + (((tickAnim - 13) / 2) * (-93.88171-(-113.46687)));
            yy = -38.38757 + (((tickAnim - 13) / 2) * (-27.6058-(-38.38757)));
            zz = 58.36899 + (((tickAnim - 13) / 2) * (71.33878-(58.36899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -1.1 + (((tickAnim - 0) / 4) * (-0.55-(-1.1)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = -1.3 + (((tickAnim - 0) / 4) * (-0.15-(-1.3)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.55 + (((tickAnim - 4) / 4) * (1-(-0.55)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = -0.15 + (((tickAnim - 4) / 4) * (0-(-0.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 8) / 2) * (-0.59-(1)));
            yy = 0 + (((tickAnim - 8) / 2) * (-0.08-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.31-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -0.59 + (((tickAnim - 10) / 3) * (-1.415-(-0.59)));
            yy = -0.08 + (((tickAnim - 10) / 3) * (0.2-(-0.08)));
            zz = 0.31 + (((tickAnim - 10) / 3) * (-1.145-(0.31)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -1.415 + (((tickAnim - 13) / 2) * (-1.1-(-1.415)));
            yy = 0.2 + (((tickAnim - 13) / 2) * (0-(0.2)));
            zz = -1.145 + (((tickAnim - 13) / 2) * (-1.3-(-1.145)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 21.03434 + (((tickAnim - 0) / 2) * (2.66922-(21.03434)));
            yy = 1.35618 + (((tickAnim - 0) / 2) * (6.12098-(1.35618)));
            zz = -2.46528 + (((tickAnim - 0) / 2) * (-2.18621-(-2.46528)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 2.66922 + (((tickAnim - 2) / 2) * (-8.83979-(2.66922)));
            yy = 6.12098 + (((tickAnim - 2) / 2) * (12.9681-(6.12098)));
            zz = -2.18621 + (((tickAnim - 2) / 2) * (5.15158-(-2.18621)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -8.83979 + (((tickAnim - 4) / 4) * (76.61623-(-8.83979)));
            yy = 12.9681 + (((tickAnim - 4) / 4) * (-6.80339-(12.9681)));
            zz = 5.15158 + (((tickAnim - 4) / 4) * (-11.24259-(5.15158)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 76.61623 + (((tickAnim - 8) / 1) * (110.07848-(76.61623)));
            yy = -6.80339 + (((tickAnim - 8) / 1) * (4.2637-(-6.80339)));
            zz = -11.24259 + (((tickAnim - 8) / 1) * (-4.86001-(-11.24259)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 110.07848 + (((tickAnim - 9) / 4) * (114.32563-(110.07848)));
            yy = 4.2637 + (((tickAnim - 9) / 4) * (19.75763-(4.2637)));
            zz = -4.86001 + (((tickAnim - 9) / 4) * (4.0756-(-4.86001)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 114.32563 + (((tickAnim - 13) / 1) * (20.25-(114.32563)));
            yy = 19.75763 + (((tickAnim - 13) / 1) * (0-(19.75763)));
            zz = 4.0756 + (((tickAnim - 13) / 1) * (0-(4.0756)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 20.25 + (((tickAnim - 14) / 1) * (21.03434-(20.25)));
            yy = 0 + (((tickAnim - 14) / 1) * (1.35618-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (-2.46528-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(xx), leftArm4.rotateAngleY + (float) Math.toRadians(yy), leftArm4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 2) * (0.705-(0.275)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.705 + (((tickAnim - 2) / 2) * (0-(0.705)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (1.315-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (-0.6-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.315 + (((tickAnim - 6) / 2) * (0.775-(1.315)));
            zz = -0.6 + (((tickAnim - 6) / 2) * (-1.2-(-0.6)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.775 + (((tickAnim - 8) / 1) * (1.615-(0.775)));
            zz = -1.2 + (((tickAnim - 8) / 1) * (-1.23-(-1.2)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 1.615 + (((tickAnim - 9) / 2) * (1.38-(1.615)));
            zz = -1.23 + (((tickAnim - 9) / 2) * (-1.7-(-1.23)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.38 + (((tickAnim - 11) / 2) * (0.33-(1.38)));
            zz = -1.7 + (((tickAnim - 11) / 2) * (-1.265-(-1.7)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.33 + (((tickAnim - 13) / 1) * (0-(0.33)));
            zz = -1.265 + (((tickAnim - 13) / 1) * (0-(-1.265)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 1) * (0.275-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm4.rotationPointX = this.leftArm4.rotationPointX + (float)(xx);
        this.leftArm4.rotationPointY = this.leftArm4.rotationPointY - (float)(yy);
        this.leftArm4.rotationPointZ = this.leftArm4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 89.82616 + (((tickAnim - 0) / 8) * (0-(89.82616)));
            yy = 72.36294 + (((tickAnim - 0) / 8) * (0-(72.36294)));
            zz = 42.97601 + (((tickAnim - 0) / 8) * (0-(42.97601)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (24.99323-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (58.52649-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-4.89309-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 24.99323 + (((tickAnim - 12) / 3) * (89.82616-(24.99323)));
            yy = 58.52649 + (((tickAnim - 12) / 3) * (72.36294-(58.52649)));
            zz = -4.89309 + (((tickAnim - 12) / 3) * (42.97601-(-4.89309)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 14.25 + (((tickAnim - 0) / 4) * (25.10257-(14.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (-52.16775-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (4.97064-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 25.10257 + (((tickAnim - 4) / 4) * (21.46091-(25.10257)));
            yy = -52.16775 + (((tickAnim - 4) / 4) * (-80.35764-(-52.16775)));
            zz = 4.97064 + (((tickAnim - 4) / 4) * (-16.53547-(4.97064)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 21.46091 + (((tickAnim - 8) / 7) * (14.25-(21.46091)));
            yy = -80.35764 + (((tickAnim - 8) / 7) * (0-(-80.35764)));
            zz = -16.53547 + (((tickAnim - 8) / 7) * (0-(-16.53547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));



        this.sail3.rotationPointX = this.sail3.rotationPointX + (float)(0);
        this.sail3.rotationPointY = this.sail3.rotationPointY - (float)(0);
        this.sail3.rotationPointZ = this.sail3.rotationPointZ + (float)(0.225);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-30.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 34.25 + (((tickAnim - 8) / 7) * (0-(34.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -30.5 + (((tickAnim - 8) / 7) * (0-(-30.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));
        

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSecodontosaurus entity = (EntityPrehistoricFloraSecodontosaurus) entitylivingbaseIn;
        int animCycle = 32;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-90))*2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+30))*3), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-80))*-3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-70))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-150))*-0.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-150))*-2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+60))*-3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-150))*-2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-200))*2), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+100))*3), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-100))*3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-250))*1), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+80))*-3), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-100))*-3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-350))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-350))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-6.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-90))*-2), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-50))*3), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-50))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-6.5), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-100))*6), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-100))*3));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 16.75 + (((tickAnim - 0) / 9) * (7.5-(16.75)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9 + (((tickAnim - 0) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3 + (((tickAnim - 0) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 7.5 + (((tickAnim - 9) / 5) * (14.63636-(7.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9 + (((tickAnim - 9) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3 + (((tickAnim - 9) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 14.63636 + (((tickAnim - 14) / 4) * (15.5-(14.63636)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9 + (((tickAnim - 14) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3 + (((tickAnim - 14) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 15.5 + (((tickAnim - 18) / 5) * (9-(15.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9 + (((tickAnim - 18) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3 + (((tickAnim - 18) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 9 + (((tickAnim - 23) / 4) * (9.5-(9)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9 + (((tickAnim - 23) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3 + (((tickAnim - 23) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 9.5 + (((tickAnim - 27) / 6) * (16.75-(9.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9 + (((tickAnim - 27) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-150))*9)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3 + (((tickAnim - 27) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 11 + (((tickAnim - 0) / 9) * (16.75-(11)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-200))*12 + (((tickAnim - 0) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-200))*12-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-200))*12)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3 + (((tickAnim - 0) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 16.75 + (((tickAnim - 9) / 9) * (11-(16.75)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-200))*12 + (((tickAnim - 9) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-200))*12-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-200))*12)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3 + (((tickAnim - 9) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 11 + (((tickAnim - 18) / 9) * (16.75-(11)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-200))*12 + (((tickAnim - 18) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-200))*12-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-200))*12)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3 + (((tickAnim - 18) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 16.75 + (((tickAnim - 27) / 6) * (11-(16.75)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-200))*12 + (((tickAnim - 27) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-200))*12-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-200))*12)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3 + (((tickAnim - 27) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*222-100))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 0) / 18) * (72.0066-(-5)));
            yy = 0 + (((tickAnim - 0) / 18) * (-14.92976-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (22.86942-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 72.0066 + (((tickAnim - 18) / 8) * (-8.29417-(72.0066)));
            yy = -14.92976 + (((tickAnim - 18) / 8) * (-6.65088-(-14.92976)));
            zz = 22.86942 + (((tickAnim - 18) / 8) * (33.12975-(22.86942)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -8.29417 + (((tickAnim - 26) / 7) * (-5-(-8.29417)));
            yy = -6.65088 + (((tickAnim - 26) / 7) * (0-(-6.65088)));
            zz = 33.12975 + (((tickAnim - 26) / 7) * (0-(33.12975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -21.57724 + (((tickAnim - 0) / 18) * (-16.5-(-21.57724)));
            yy = -6.88311 + (((tickAnim - 0) / 18) * (0-(-6.88311)));
            zz = -11.57514 + (((tickAnim - 0) / 18) * (0-(-11.57514)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = -16.5 + (((tickAnim - 18) / 8) * (28.02637-(-16.5)));
            yy = 0 + (((tickAnim - 18) / 8) * (4.16665-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (-7.87281-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 28.02637 + (((tickAnim - 26) / 7) * (-21.57724-(28.02637)));
            yy = 4.16665 + (((tickAnim - 26) / 7) * (-6.88311-(4.16665)));
            zz = -7.87281 + (((tickAnim - 26) / 7) * (-11.57514-(-7.87281)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 18) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (-0.12-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (-0.175-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = -0.12 + (((tickAnim - 26) / 7) * (-0.225-(-0.12)));
            zz = -0.175 + (((tickAnim - 26) / 7) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 27.92321 + (((tickAnim - 0) / 8) * (-5.8627-(27.92321)));
            yy = -1.93551 + (((tickAnim - 0) / 8) * (-1.19449-(-1.93551)));
            zz = 4.0634 + (((tickAnim - 0) / 8) * (-7.40481-(4.0634)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -5.8627 + (((tickAnim - 8) / 10) * (74.25-(-5.8627)));
            yy = -1.19449 + (((tickAnim - 8) / 10) * (0-(-1.19449)));
            zz = -7.40481 + (((tickAnim - 8) / 10) * (0-(-7.40481)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 74.25 + (((tickAnim - 18) / 3) * (97.42-(74.25)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 97.42 + (((tickAnim - 21) / 5) * (75.51-(97.42)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 75.51 + (((tickAnim - 26) / 5) * (12.88076-(75.51)));
            yy = 0 + (((tickAnim - 26) / 5) * (-4.00905-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (10.52003-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 12.88076 + (((tickAnim - 31) / 2) * (27.92321-(12.88076)));
            yy = -4.00905 + (((tickAnim - 31) / 2) * (-1.93551-(-4.00905)));
            zz = 10.52003 + (((tickAnim - 31) / 2) * (4.0634-(10.52003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.6 + (((tickAnim - 0) / 4) * (0.315-(0.6)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.09-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.315 + (((tickAnim - 4) / 4) * (-0.275-(0.315)));
            zz = -0.09 + (((tickAnim - 4) / 4) * (0-(-0.09)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 8) / 5) * (1.64-(-0.275)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.26-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.64 + (((tickAnim - 13) / 5) * (0.7-(1.64)));
            zz = -0.26 + (((tickAnim - 13) / 5) * (-0.35-(-0.26)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 0.7 + (((tickAnim - 18) / 8) * (1.38-(0.7)));
            zz = -0.35 + (((tickAnim - 18) / 8) * (-0.76-(-0.35)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            yy = 1.38 + (((tickAnim - 26) / 5) * (0-(1.38)));
            zz = -0.76 + (((tickAnim - 26) / 5) * (0-(-0.76)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 2) * (0.6-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 72.0066 + (((tickAnim - 0) / 8) * (-8.29417-(72.0066)));
            yy = 14.92976 + (((tickAnim - 0) / 8) * (6.65088-(14.92976)));
            zz = -22.86942 + (((tickAnim - 0) / 8) * (-33.12975-(-22.86942)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -8.29417 + (((tickAnim - 8) / 6) * (-5-(-8.29417)));
            yy = 6.65088 + (((tickAnim - 8) / 6) * (0-(6.65088)));
            zz = -33.12975 + (((tickAnim - 8) / 6) * (0-(-33.12975)));
        }
        else if (tickAnim >= 14 && tickAnim < 33) {
            xx = -5 + (((tickAnim - 14) / 19) * (72.0066-(-5)));
            yy = 0 + (((tickAnim - 14) / 19) * (14.92976-(0)));
            zz = 0 + (((tickAnim - 14) / 19) * (-22.86942-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -16.5 + (((tickAnim - 0) / 8) * (28.02637-(-16.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (4.16665-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-7.87281-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 28.02637 + (((tickAnim - 8) / 6) * (-21.57724-(28.02637)));
            yy = 4.16665 + (((tickAnim - 8) / 6) * (6.88311-(4.16665)));
            zz = -7.87281 + (((tickAnim - 8) / 6) * (11.57514-(-7.87281)));
        }
        else if (tickAnim >= 14 && tickAnim < 33) {
            xx = -21.57724 + (((tickAnim - 14) / 19) * (-16.5-(-21.57724)));
            yy = 6.88311 + (((tickAnim - 14) / 19) * (0-(6.88311)));
            zz = 11.57514 + (((tickAnim - 14) / 19) * (0-(11.57514)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.12-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.175-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = -0.12 + (((tickAnim - 8) / 6) * (-0.225-(-0.12)));
            zz = -0.175 + (((tickAnim - 8) / 6) * (0-(-0.175)));
        }
        else if (tickAnim >= 14 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 14) / 19) * (0-(0)));
            yy = -0.225 + (((tickAnim - 14) / 19) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 14) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 74.25 + (((tickAnim - 0) / 3) * (97.42-(74.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 97.42 + (((tickAnim - 3) / 5) * (75.51-(97.42)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 75.51 + (((tickAnim - 8) / 5) * (12.88076-(75.51)));
            yy = 0 + (((tickAnim - 8) / 5) * (-4.00905-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (10.52003-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 12.88076 + (((tickAnim - 13) / 1) * (27.92321-(12.88076)));
            yy = -4.00905 + (((tickAnim - 13) / 1) * (1.93551-(-4.00905)));
            zz = 10.52003 + (((tickAnim - 13) / 1) * (-4.0634-(10.52003)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 27.92321 + (((tickAnim - 14) / 8) * (-5.8627-(27.92321)));
            yy = 1.93551 + (((tickAnim - 14) / 8) * (1.19449-(1.93551)));
            zz = -4.0634 + (((tickAnim - 14) / 8) * (7.40481-(-4.0634)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = -5.8627 + (((tickAnim - 22) / 11) * (74.25-(-5.8627)));
            yy = 1.19449 + (((tickAnim - 22) / 11) * (0-(1.19449)));
            zz = 7.40481 + (((tickAnim - 22) / 11) * (0-(7.40481)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.7 + (((tickAnim - 0) / 8) * (1.38-(0.7)));
            zz = -0.35 + (((tickAnim - 0) / 8) * (-0.76-(-0.35)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.38 + (((tickAnim - 8) / 5) * (0-(1.38)));
            zz = -0.76 + (((tickAnim - 8) / 5) * (0-(-0.76)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0.6-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.6 + (((tickAnim - 14) / 4) * (0.315-(0.6)));
            zz = 0 + (((tickAnim - 14) / 4) * (-0.09-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.315 + (((tickAnim - 18) / 4) * (-0.275-(0.315)));
            zz = -0.09 + (((tickAnim - 18) / 4) * (0-(-0.09)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = -0.275 + (((tickAnim - 22) / 6) * (1.64-(-0.275)));
            zz = 0 + (((tickAnim - 22) / 6) * (-0.26-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 1.64 + (((tickAnim - 28) / 5) * (0.7-(1.64)));
            zz = -0.26 + (((tickAnim - 28) / 5) * (-0.35-(-0.26)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(sail2, sail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5))*1.5), sail2.rotateAngleY + (float) Math.toRadians(0), sail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-110))*-3.5));
        this.sail2.rotationPointX = this.sail2.rotationPointX + (float)(0);
        this.sail2.rotationPointY = this.sail2.rotationPointY - (float)(-0.25);
        this.sail2.rotationPointZ = this.sail2.rotationPointZ + (float)(0.2);


        this.setRotateAngle(sail, sail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-150))*-1.5), sail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+30))*1), sail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-140))*-3));
        this.sail.rotationPointX = this.sail.rotationPointX + (float)(0);
        this.sail.rotationPointY = this.sail.rotationPointY - (float)(0);
        this.sail.rotationPointZ = this.sail.rotationPointZ + (float)(-0.15);



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 42.93315 + (((tickAnim - 0) / 9) * (-113.46687-(42.93315)));
            yy = 15.04975 + (((tickAnim - 0) / 9) * (38.38757-(15.04975)));
            zz = 13.33482 + (((tickAnim - 0) / 9) * (-58.36899-(13.33482)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -113.46687 + (((tickAnim - 9) / 7) * (-73.70924-(-113.46687)));
            yy = 38.38757 + (((tickAnim - 9) / 7) * (44.51569-(38.38757)));
            zz = -58.36899 + (((tickAnim - 9) / 7) * (-50.69688-(-58.36899)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = -73.70924 + (((tickAnim - 16) / 8) * (-19.09618-(-73.70924)));
            yy = 44.51569 + (((tickAnim - 16) / 8) * (33.60811-(44.51569)));
            zz = -50.69688 + (((tickAnim - 16) / 8) * (-9.49659-(-50.69688)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -19.09618 + (((tickAnim - 24) / 9) * (42.93315-(-19.09618)));
            yy = 33.60811 + (((tickAnim - 24) / 9) * (15.04975-(33.60811)));
            zz = -9.49659 + (((tickAnim - 24) / 9) * (13.33482-(-9.49659)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.39-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.53-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0.39 + (((tickAnim - 3) / 6) * (1.415-(0.39)));
            yy = -0.05 + (((tickAnim - 3) / 6) * (-0.2-(-0.05)));
            zz = 0.53 + (((tickAnim - 3) / 6) * (-1.77-(0.53)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 1.415 + (((tickAnim - 9) / 7) * (1.1-(1.415)));
            yy = -0.2 + (((tickAnim - 9) / 7) * (0-(-0.2)));
            zz = -1.77 + (((tickAnim - 9) / 7) * (-1.075-(-1.77)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 1.1 + (((tickAnim - 16) / 17) * (0-(1.1)));
            yy = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            zz = -1.075 + (((tickAnim - 16) / 17) * (0-(-1.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 76.61623 + (((tickAnim - 0) / 3) * (100.36287-(76.61623)));
            yy = -6.80339 + (((tickAnim - 0) / 3) * (-5.94331-(-6.80339)));
            zz = -11.24259 + (((tickAnim - 0) / 3) * (-9.07819-(-11.24259)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 100.36287 + (((tickAnim - 3) / 6) * (117.43724-(100.36287)));
            yy = -5.94331 + (((tickAnim - 3) / 6) * (-3.64974-(-5.94331)));
            zz = -9.07819 + (((tickAnim - 3) / 6) * (-3.30646-(-9.07819)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 117.43724 + (((tickAnim - 9) / 5) * (23.75-(117.43724)));
            yy = -3.64974 + (((tickAnim - 9) / 5) * (0-(-3.64974)));
            zz = -3.30646 + (((tickAnim - 9) / 5) * (0-(-3.30646)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 23.75 + (((tickAnim - 14) / 2) * (19.93758-(23.75)));
            yy = 0 + (((tickAnim - 14) / 2) * (0.48242-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (-2.5732-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 19.93758 + (((tickAnim - 16) / 8) * (-5.49016-(19.93758)));
            yy = 0.48242 + (((tickAnim - 16) / 8) * (-5.16923-(0.48242)));
            zz = -2.5732 + (((tickAnim - 16) / 8) * (-7.13023-(-2.5732)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -5.49016 + (((tickAnim - 24) / 9) * (76.61623-(-5.49016)));
            yy = -5.16923 + (((tickAnim - 24) / 9) * (-6.80339-(-5.16923)));
            zz = -7.13023 + (((tickAnim - 24) / 9) * (-11.24259-(-7.13023)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(xx), rightArm4.rotateAngleY + (float) Math.toRadians(yy), rightArm4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.65 + (((tickAnim - 0) / 3) * (1.38-(1.65)));
            zz = -1.2 + (((tickAnim - 0) / 3) * (-1.435-(-1.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 1.38 + (((tickAnim - 3) / 6) * (0.73-(1.38)));
            zz = -1.435 + (((tickAnim - 3) / 6) * (-1.44-(-1.435)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0.73 + (((tickAnim - 9) / 5) * (0.6-(0.73)));
            zz = -1.44 + (((tickAnim - 9) / 5) * (0-(-1.44)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 14) / 2) * (0.8-(0.6)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            yy = 0.8 + (((tickAnim - 16) / 8) * (0.08-(0.8)));
            zz = 0 + (((tickAnim - 16) / 8) * (0.06-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            yy = 0.08 + (((tickAnim - 24) / 9) * (1.65-(0.08)));
            zz = 0.06 + (((tickAnim - 24) / 9) * (-1.2-(0.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm4.rotationPointX = this.rightArm4.rotationPointX + (float)(xx);
        this.rightArm4.rotationPointY = this.rightArm4.rotationPointY - (float)(yy);
        this.rightArm4.rotationPointZ = this.rightArm4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -93.88171 + (((tickAnim - 0) / 8) * (-34.8226-(-93.88171)));
            yy = -27.6058 + (((tickAnim - 0) / 8) * (-46.18242-(-27.6058)));
            zz = 71.33878 + (((tickAnim - 0) / 8) * (29.09521-(71.33878)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -34.8226 + (((tickAnim - 8) / 9) * (42.93315-(-34.8226)));
            yy = -46.18242 + (((tickAnim - 8) / 9) * (-15.04975-(-46.18242)));
            zz = 29.09521 + (((tickAnim - 8) / 9) * (13.33482-(29.09521)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 42.93315 + (((tickAnim - 17) / 9) * (-113.46687-(42.93315)));
            yy = -15.04975 + (((tickAnim - 17) / 9) * (-38.38757-(-15.04975)));
            zz = 13.33482 + (((tickAnim - 17) / 9) * (58.36899-(13.33482)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -113.46687 + (((tickAnim - 26) / 7) * (-93.88171-(-113.46687)));
            yy = -38.38757 + (((tickAnim - 26) / 7) * (-27.6058-(-38.38757)));
            zz = 58.36899 + (((tickAnim - 26) / 7) * (71.33878-(58.36899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -1.1 + (((tickAnim - 0) / 8) * (-0.55-(-1.1)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = -1.3 + (((tickAnim - 0) / 8) * (-0.15-(-1.3)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -0.55 + (((tickAnim - 8) / 9) * (1-(-0.55)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = -0.15 + (((tickAnim - 8) / 9) * (0-(-0.15)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 1 + (((tickAnim - 17) / 4) * (-0.59-(1)));
            yy = 0 + (((tickAnim - 17) / 4) * (-0.08-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0.31-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -0.59 + (((tickAnim - 21) / 5) * (-1.415-(-0.59)));
            yy = -0.08 + (((tickAnim - 21) / 5) * (0.2-(-0.08)));
            zz = 0.31 + (((tickAnim - 21) / 5) * (-1.145-(0.31)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -1.415 + (((tickAnim - 26) / 7) * (-1.1-(-1.415)));
            yy = 0.2 + (((tickAnim - 26) / 7) * (0-(0.2)));
            zz = -1.145 + (((tickAnim - 26) / 7) * (-1.3-(-1.145)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 21.03434 + (((tickAnim - 0) / 3) * (2.66922-(21.03434)));
            yy = 1.35618 + (((tickAnim - 0) / 3) * (6.12098-(1.35618)));
            zz = -2.46528 + (((tickAnim - 0) / 3) * (-2.18621-(-2.46528)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 2.66922 + (((tickAnim - 3) / 5) * (-8.83979-(2.66922)));
            yy = 6.12098 + (((tickAnim - 3) / 5) * (12.9681-(6.12098)));
            zz = -2.18621 + (((tickAnim - 3) / 5) * (5.15158-(-2.18621)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -8.83979 + (((tickAnim - 8) / 9) * (76.61623-(-8.83979)));
            yy = 12.9681 + (((tickAnim - 8) / 9) * (-6.80339-(12.9681)));
            zz = 5.15158 + (((tickAnim - 8) / 9) * (-11.24259-(5.15158)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 76.61623 + (((tickAnim - 17) / 3) * (110.07848-(76.61623)));
            yy = -6.80339 + (((tickAnim - 17) / 3) * (4.2637-(-6.80339)));
            zz = -11.24259 + (((tickAnim - 17) / 3) * (-4.86001-(-11.24259)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 110.07848 + (((tickAnim - 20) / 6) * (114.32563-(110.07848)));
            yy = 4.2637 + (((tickAnim - 20) / 6) * (19.75763-(4.2637)));
            zz = -4.86001 + (((tickAnim - 20) / 6) * (4.0756-(-4.86001)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 114.32563 + (((tickAnim - 26) / 5) * (20.25-(114.32563)));
            yy = 19.75763 + (((tickAnim - 26) / 5) * (0-(19.75763)));
            zz = 4.0756 + (((tickAnim - 26) / 5) * (0-(4.0756)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 20.25 + (((tickAnim - 31) / 2) * (21.03434-(20.25)));
            yy = 0 + (((tickAnim - 31) / 2) * (1.35618-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (-2.46528-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(xx), leftArm4.rotateAngleY + (float) Math.toRadians(yy), leftArm4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 3) * (0.705-(0.275)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.705 + (((tickAnim - 3) / 5) * (0-(0.705)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (1.315-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.6-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 1.315 + (((tickAnim - 13) / 4) * (0.775-(1.315)));
            zz = -0.6 + (((tickAnim - 13) / 4) * (-1.2-(-0.6)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.775 + (((tickAnim - 17) / 3) * (1.615-(0.775)));
            zz = -1.2 + (((tickAnim - 17) / 3) * (-1.23-(-1.2)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 1.615 + (((tickAnim - 20) / 3) * (1.38-(1.615)));
            zz = -1.23 + (((tickAnim - 20) / 3) * (-1.7-(-1.23)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 1.38 + (((tickAnim - 23) / 3) * (0.33-(1.38)));
            zz = -1.7 + (((tickAnim - 23) / 3) * (-1.265-(-1.7)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            yy = 0.33 + (((tickAnim - 26) / 5) * (0-(0.33)));
            zz = -1.265 + (((tickAnim - 26) / 5) * (0-(-1.265)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 2) * (0.275-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm4.rotationPointX = this.leftArm4.rotationPointX + (float)(xx);
        this.leftArm4.rotationPointY = this.leftArm4.rotationPointY - (float)(yy);
        this.leftArm4.rotationPointZ = this.leftArm4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 89.82616 + (((tickAnim - 0) / 17) * (0-(89.82616)));
            yy = 72.36294 + (((tickAnim - 0) / 17) * (0-(72.36294)));
            zz = 42.97601 + (((tickAnim - 0) / 17) * (0-(42.97601)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (24.99323-(0)));
            yy = 0 + (((tickAnim - 17) / 8) * (58.52649-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (-4.89309-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 24.99323 + (((tickAnim - 25) / 8) * (89.82616-(24.99323)));
            yy = 58.52649 + (((tickAnim - 25) / 8) * (72.36294-(58.52649)));
            zz = -4.89309 + (((tickAnim - 25) / 8) * (42.97601-(-4.89309)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 14.25 + (((tickAnim - 0) / 9) * (25.10257-(14.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (-52.16775-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (4.97064-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 25.10257 + (((tickAnim - 9) / 7) * (21.46091-(25.10257)));
            yy = -52.16775 + (((tickAnim - 9) / 7) * (-80.35764-(-52.16775)));
            zz = 4.97064 + (((tickAnim - 9) / 7) * (-16.53547-(4.97064)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 21.46091 + (((tickAnim - 16) / 17) * (14.25-(21.46091)));
            yy = -80.35764 + (((tickAnim - 16) / 17) * (0-(-80.35764)));
            zz = -16.53547 + (((tickAnim - 16) / 17) * (0-(-16.53547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));



        this.sail3.rotationPointX = this.sail3.rotationPointX + (float)(0);
        this.sail3.rotationPointY = this.sail3.rotationPointY - (float)(0);
        this.sail3.rotationPointZ = this.sail3.rotationPointZ + (float)(0.225);



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-30.5-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 34.25 + (((tickAnim - 16) / 17) * (0-(34.25)));
            yy = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            zz = -30.5 + (((tickAnim - 16) / 17) * (0-(-30.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSecodontosaurus ee = (EntityPrehistoricFloraSecodontosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            //moving in water
            //
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSecodontosaurus e = (EntityPrehistoricFloraSecodontosaurus) entity;

    }
}
